package com.dubbos.consumer.action;

import com.dubbos.api.AnnotationService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("annotationAction")
public class AnnotationAction {

    @Reference
    private AnnotationService annotationService;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }
}
