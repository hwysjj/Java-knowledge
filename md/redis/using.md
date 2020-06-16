# redis 进阶

## 管道(pipelining)

## 发布/订阅(pub/sub)

## redis事务

- multi
- exec

redis不支持回滚

## RedisBloom

## 过期判定远离

- 被动访问的判定
- 周期轮询判定（增量）

目的：稍微牺牲下内存，但是保证redis性能为王。