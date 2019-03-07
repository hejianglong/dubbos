package com.dubbos.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
