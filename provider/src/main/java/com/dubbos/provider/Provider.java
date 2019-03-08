package com.dubbos.provider;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Provider {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.in.read();
    }
}
