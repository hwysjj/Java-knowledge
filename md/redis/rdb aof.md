## 单机持久化

- 快照/副本
- 日志

1. RDB
    - 时点型
    - save
        - 阻塞， 不对外提供服务
        - 明确，关机维护
    - bgsave
        - 非阻塞，redis继续对外提供服务，并且将数据落地
        - linux fork(系统调用)，父进程fork迅速创建子进程（指针），子进程异步存磁盘 （某个时间点所有数据的快照）
        - 父进程copy on write, 写的时候在内存创建一个新的地址写
    - 配置文件中给出bgsave的规则，用的是save标识，但是出发的是bgsave
        - save 900 1
        - save 300 10
        - save 60 10000
        - dbfilename dump.rdb
        - dir /var/lib/redis/6379
    - 弊端
        - 不支持拉链，只有一个dump.rdb
        - 丢失数据相对要多一些，时间点与时点之间的窗口数据容易丢失，8点得到一个rdb, 9点刚要落一个rdb挂机了
    - 优点
        - 类似java中的序列化，恢复速度相对快

2. AOF (append only file)
    - redis的写操作记录到文件中
        - 丢数据少
        - rdb和aof可以同时开启，如果开启了aof, 只会用aof恢复数据，4.0之后aof中包含rdb全量，增加新的记录新的写操作
    - 弊端
        - 体量无限变大，恢复慢

        solution: 

            - hdfs, fsiimage+edits.log, 让日志只记录增量合并的过程，保证日志足够小
            - redis
                - 4.0前，重写，删除抵消的命令，合并重复的命令，最终也是一个纯指令的日志文件。
                - 4.0后，重写，将老的数据rdb到aof文件中，将增量的以指令的方式append到aof, aof是一个混合体，利用的rdb的快，利用了aof的全量，不丢数据。
    
    问题？

    redis运行了10年，开启了aof, 10年头redis挂了

    1）aof多大：很大，10t， 恢复会溢出

    2）恢复要多久？

    redis是内存数据库，写操作出发Io，appendonly yes, appendfilename "appendonly.aof"
    
    - appendfsync no, 
    - appendfsunc always
    - appendfsync everysec
    