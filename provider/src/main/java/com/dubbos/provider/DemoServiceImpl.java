package com.dubbos.provider;

import com.dubbos.api.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        if ("throw".equals(name)) {
            throw new NullPointerException();
        }
        return "Hello " + name;
    }
}
