package com.nero.springboot.activemq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private Producer producer;

    @Test
    public void contextLoads() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            producer.sendQueueMsg(i + " hello");
            Thread.sleep(1000);
        }

        for (int i = 0; i < 10; i++) {
            producer.sendTopicMsg(i + " hello");
            Thread.sleep(1000);
        }
    }

}
