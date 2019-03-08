package com.dubbos.consumer;

import com.dubbos.consumer.action.AnnotationAction;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.io.IOException;

public class Consumer {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        AnnotationAction annotationAction = (AnnotationAction)context.getBean("annotationAction");
        System.out.println(annotationAction.doSayHello("woca"));
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.dubbos.consumer.action")
    @PropertySource("classpath:dubbo-consumer.properties")
    @ComponentScan(value = {"com.dubbos.consumer.action"})
    static public class ConsumerConfiguration {

    }
}
