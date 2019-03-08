package com.dubbos.consumer;

import com.dubbos.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        applicationContext.start();
        DemoService demoService = (DemoService) applicationContext.getBean("demoService");
        String hello = demoService.sayHello("long");
        // String hello = demoService.sayHello("throw");
        System.out.println(hello);
    }
}
