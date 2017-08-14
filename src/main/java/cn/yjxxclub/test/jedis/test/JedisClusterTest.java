package cn.yjxxclub.test.jedis.test;

import cn.yjxxclub.test.jedis.config.JedisFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-8-13
 * Time: 下午11:47
 * Describe: 官方cluster 测试
 */
public class JedisClusterTest {
    public static void main(String[] args){
        JedisCluster jedisCluster = new JedisFactory().getJedisCluster();
        test(jedisCluster);
    }

    public static void test(JedisCluster jedisCluster){
        for (int i=0;i<10000;i++){
            jedisCluster.set("foo"+i, "bar"+i);
            String value = jedisCluster.get("foo"+i);
            //jedisCluster.del("foo"+i);
        }
    }
}
