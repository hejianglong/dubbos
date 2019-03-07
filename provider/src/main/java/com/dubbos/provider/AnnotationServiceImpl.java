/*
 * Project: com.dubbos.provider
 *
 * File Created at 2019-03-07
 *
 * Copyright 2019 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.dubbos.provider;

import com.dubbos.api.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author hejianglong
 * @date 2019-03-07 22:21
 * @email hejlong@163.com
 * @Desc
 */
@Service
public class AnnotationServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "annotation: helo," + name;
    }
}
