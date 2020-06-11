# redis

## 一. 数据存文件

grep akw java

### 常识

1. 数据存磁盘

  - 寻址: ms
  - 带宽: G/M

2. 内存

  - 寻址: ns
  - 带宽: 很大

结论

秒 > 毫秒 > 微妙 > 纳秒， 磁盘比内存在寻址上满10W倍

3. I/O buffer: 成本问题

磁盘与磁道， 扇区，1扇区 = 512byte 导致成本变大: 索引

4K 操作系统无论读多少都从磁盘最少拿4K，随着文件变大，速度变慢，磁盘IO成为瓶颈

## 二. 存数据库
 
- 1个data page: 4k，通过索引提高速度
- 关系型数据库建表时一定要给出schema, 类型: 字节宽度， 存: 行极存储
- B+T（内存） -> 索引（磁盘） -> 数据（磁盘）

### 数据库变大，性能下降？

- 如果表有索引，增删改变慢
- 查询速度？
    - 一个或者少量，依然很快
    - 并发大的时候会受硬盘带宽影响速度
- SAP HANA 内存级别的关系型数据库
    -数据在磁盘和内存中体积不一样

## 三. 存缓存 （折中方法，memcached, redis）

- 两个基础设置
    - 冯诺伊曼体系的硬件
    - 以太网，TCP/IP的网络
    
- [DB Engines Ranking](https://db-engines.com/en/ranking)

### redis

Redis 是一个开源（BSD许可）的，内存中的数据结构存储系统，它可以用作数据库、缓存和消息中间件。 它支持多种类型的数据结构，如 字符串（strings）， 散列（hashes）， 列表（lists）， 集合（sets）， 有序集合（sorted sets） 与范围查询， bitmaps， hyperloglogs 和 地理空间（geospatial） 索引半径查询。 Redis 内置了 复制（replication），LUA脚本（Lua scripting）， LRU驱动事件（LRU eviction），事务（transactions） 和不同级别的 磁盘持久化（persistence）， 并通过 Redis哨兵（Sentinel）和自动 分区（Cluster）提供高可用性（high availability）。

- memcache
    - 返回value所有的数据到client server 网口io
    - client要有实现代码去解码

- 类型不是很重，重要的是redis对每种类型都有自己的方法index() ipop (计算向数据移动)

- redis是单进程，单线程，单实例，但高并发请求怎么变得快的？

- NIO non-blocking IO

## 安装redis

```bash
$ yum install wget
$ cd ~
$ mkdir soft
$ cd soft
$ wget http://download.redis.io/releases/redis-5.0.8.tar.gz
$ tar xf redis...tar.gz
$ cd redis-src
$ 看README.md
$ make
  1. yum install gcc
  2. make distclean
$ make
$ cd src   ...看生成了可执行程序
$ cd ..
$ make install PREFIX=/opt/whua/redis5
$ vi /etc/profile
  export REDIS_HOME=/opt/whua/redis5
  export PATH=$PATH:$REDIS_HOME/bin
$ source /etc/profile
$ cd ~/soft/utils
$ ./install_server.sh
  a) 一个redis里面可以有多个redis实例（进程），通过port区分
  b) 可执行程序就只有一份，但是内存中未来的多个实例需要各自的配置文件，持久化目录等资源
$ service redis_6379 start/stop/status  > linux /etc/init.d/****
# 查看running的进程
$ ps fe | grep redis
```








