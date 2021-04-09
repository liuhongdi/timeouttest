package com.timeouttest.demo.controller;

import com.timeouttest.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.Instant;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HelloService helloService;

    /**
     * 同步方法
     * * @return
     */
    @GetMapping("/sync")
    public String getSyncHello(){
        long n = Instant.now().toEpochMilli();
        //异步
        String s = helloService.synchSayHello();
        long f = Instant.now().toEpochMilli();
        return s;
    }
}
