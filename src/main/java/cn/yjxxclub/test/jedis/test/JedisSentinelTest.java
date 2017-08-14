package cn.yjxxclub.test.jedis.test;

import cn.yjxxclub.test.jedis.config.JedisFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-8-13
 * Time: 下午11:47
 * Describe: Sentinel集群测试
 */
public class JedisSentinelTest {
    public static void main(String[] args){
        JedisSentinelPool jedisSentinelPool = new JedisFactory().getJedisSentinel();
        Jedis jedis = jedisSentinelPool.getResource();
        test(jedis);
    }

    public static void test(Jedis jedis ){
        for (int i=0;i<10000;i++){
            jedis.set("foo"+i, "bar"+i);
            String value = jedis.get("foo"+i);
            //jedisCluster.del("foo"+i);
        }
    }
}
