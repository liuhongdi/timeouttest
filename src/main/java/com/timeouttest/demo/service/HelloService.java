package com.timeouttest.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HelloService {

   //同步方法
    public String synchSayHello() {
        try {
            //sleepService.syncSleep();
            System.out.println("同步:线程名: " +Thread.currentThread().getName());
            Thread.sleep(3000);
            return "this is sync";
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "error";
        }
    }

}
