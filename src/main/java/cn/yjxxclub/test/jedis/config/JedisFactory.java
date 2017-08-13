package cn.yjxxclub.test.jedis.config;

import redis.clients.jedis.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-8-13
 * Time: 下午10:42
 * Describe: 自定义jedis集群 工厂类
 */
public class JedisFactory {

    /**
     * jedis 集群默认配置
     * @return
     */
    public JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(50);
        config.setMinIdle(20);
        config.setMaxWaitMillis(6 * 1000);
        config.setTestOnBorrow(true);
        return config;
    }

    /**
     * 方案一
     * cluster集群(其实只需要一个即可)
     * @return
     */
    public Set<HostAndPort> getJedisClusterNodes(){
        Set<HostAndPort> jedisClusterNodes =new HashSet();
        jedisClusterNodes.add(new HostAndPort("localhost", 8001));
        jedisClusterNodes.add(new HostAndPort("localhost", 8002));
        jedisClusterNodes.add(new HostAndPort("localhost", 8003));
        jedisClusterNodes.add(new HostAndPort("localhost", 8004));
        jedisClusterNodes.add(new HostAndPort("localhost", 8005));
        jedisClusterNodes.add(new HostAndPort("localhost", 8006));
        return jedisClusterNodes;
    }

    /**
     * 方案二
     * sentinel 烧饼集群
     * @return
     */
    public Set<String> getJedisSentinelNodes() {
        Set<String> sentinels= new HashSet<String>();
        sentinels.add("127.0.0.1:8201");
        sentinels.add("127.0.0.1:8101");
        return sentinels;
    }

    /**
     * sentinel 烧饼集群 masterName
     * @return
     */
    public String getJedisSentinelNodeMasterName(){
        String masterName = "master-1";
        return masterName;
    }


    /**
     * redis cluster 实例
     * @return
     */
    public JedisCluster getJedisCluster(){
        JedisCluster jedisCluster = new JedisCluster(getJedisClusterNodes(),getJedisPoolConfig());
        return jedisCluster;
    }

    /**
     * redis sentinelPool 实例
     * @return
     */
    public JedisSentinelPool getJedisSentinel(){
        JedisSentinelPool jedisSentinelPool = new JedisSentinelPool(getJedisSentinelNodeMasterName(),
                getJedisSentinelNodes(),
                getJedisPoolConfig());
        return jedisSentinelPool;
    }

}
