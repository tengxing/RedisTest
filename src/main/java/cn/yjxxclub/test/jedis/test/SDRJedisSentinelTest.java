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
 * Describe: Spring Jedis Sentinel 测试
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:sentinel.xml"})
public class SDRJedisSentinelTest {

    @Test
    public void sentinel(){
        System.out.print("tengxing");
    }
}
