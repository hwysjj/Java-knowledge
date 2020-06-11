## Strng

1. 字符串

- set
- get
- append
- setrange
- getrange
- strlen

2. 数值

- incr
    - 应用场景 秒杀 抢购 详情页，点赞，评论， 规避高并发下对数据库的事务操作，完全由redis内存操作

3. bitmap

- setbit
- bitcount
- bitpos
- bitop
    - 应用场景
        1. 用户系统，统计用户登录天数 
            - setbit sean 1 1
            - setbit sean 7 1
            - setbit sean 364 1
            - strlen sean
            - bitcount sean -2 -1
        2. 电商做活动，送礼物，大库需要备货多少？总共2e用户。僵尸用户，冷热用户/忠诚用户，活跃用户统计
            - setbit 20200101 1 1
            - setbit 20200102 1 1
            - setbit 20200102 7 1
            - bitop or destkey 20200101 20200102
            - bitcount destkey 0 -1

## List

列表：单向，双向，有环，无欢
- lpush
- lpop
- rpush
- rpop
- lrange
- lindex
- lset
- lrem
- linsert
- blpop
- ltrim

1. 栈（同向队列）
2. 队列（反向队列）
3. 数组
4. 阻塞，单播队列 (fifo: first in first out)

## hash (map k-v)

- hset
- hget
- hmget
- hkeys
- hvals
- hgetall
- hincrbyfloat

1. field数值计算 场景：点赞，详情页

## set

- sadd
- srem
- smembers
- sinter (交集)
- sinterstore
- sunion (并集)
- sdiff (差集)
- srandmember (随机)
- spop

1. 无序，去重
2. 集合操作
3. 随机事件（抽奖 用户重复/不重复）
    - 正数：不重复
    - 负数：重复

## sorted set



