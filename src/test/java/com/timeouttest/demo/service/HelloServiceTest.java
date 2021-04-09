package com.timeouttest.demo.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    @Timeout(value = 3500, unit = TimeUnit.MILLISECONDS)
    @DisplayName("测试3.5秒，不会超时")
    void synchSayHello() {
       String ret =  helloService.synchSayHello();
       System.out.println(ret);
    }

    @Test
    @Timeout(2)
    @DisplayName("测试2秒，会超时")
    void synchSayHelloFail() {
        String ret =  helloService.synchSayHello();
        System.out.println(ret);
    }
}