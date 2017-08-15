package cn.yjxxclub.test.jedis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-8-14
 * Time: 下午8:26
 * Describe: pring Jedis Cluster 测试
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:cluster.xml"})
public class SDRJedisClusterTest {
    @Test
    public void cluster(){

    }
}
