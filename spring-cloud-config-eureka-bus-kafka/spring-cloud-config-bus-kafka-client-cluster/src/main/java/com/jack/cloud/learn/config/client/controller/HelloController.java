package com.jack.cloud.learn.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: JackWu
 * @create: 2018-12-27 14:38
 **/
@RestController
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
// 刷新操作： curl -X POST http://localhost:7002/actuator/refresh
@RefreshScope
public class HelloController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping(value = "/hello")
    public String hello(){
        return this.hello;
    }
}
