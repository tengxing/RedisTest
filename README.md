# redisCluster
redis高可用集群测试

架构
==

- Redis Sentinel + Jedis Sentinel 

单Jedis
==

配置在config目录下（包含两种配置原生），根据实际情况修改

结合spring
==

配置在xml文件中
包括sentinel.xml和cluster.xml两种sdr封装配置




