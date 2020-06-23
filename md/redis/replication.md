# 主从复制

问题：单机，单点，单实例？

- 单点故障
- 容量有限
- 压力

## AKF

- x轴：全量，镜像
- y轴: 业务，功能
- z轴: 优先级，逻辑再拆分

问题：通过AKF，一变多

## 数据一致性

- 强一致性，同步阻塞
    - 所有节点阻塞直到数据全部一致（强一致性，极易破坏可用性，为什么一变多，解决可用性）
- 异步非阻塞
    - 容忍数据丢失一部分
- 最终数据一致
    - kafka 可靠 集群， 响应速度足够快

## 命令

- redis-server 6379.conf
- redis-server --sentinel
    - 配置文件
        - port 26379
        - sentinel monitor mymaster 127.0.0.1 6379 2
    - 哨兵通过发布订阅发现其他哨兵
    - 主挂了，哨兵自动投票切换主
- replicaof 127.0.0.1 6379
- replicaof no one

## 集群

1. 逻辑业务拆分

2. 算法
    - hash+取模  modula
        - 模数必须固定 %2 %4 %10
    - random lpush
        - client rpop, 消息队列 topic and partition kafka
    - kemata 一致性哈希， 没有取模，规划一个环形哈希环
        - 优点：可以分担其他节点的压力，不会造成全局洗盘
        - 缺点：新增节点造成小部分数据不能命中，问题：击穿，压到数据库，方案：取最近的两个节点
    - 虚拟节点， 解决数据倾斜问题

问题，多个client直接连接多台redis服务器，成本很高

3. 使用proxy（nginx）, 需要关注代理层性能

4. client s -> lvs -> proxy s -> redis s
    - 多台lvs keepalived 

## 集群代理

- twemproxy
- predixy
- redis cluster 
- codis

