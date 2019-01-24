package com.jack.cloud.learn.consumer.controller;

import com.jack.cloud.learn.consumer.remote.HelloRemote1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: JackWu
 * @create: 2018-12-25 14:41
 **/
@RestController
public class HelloController {

    @Resource
    HelloRemote1 helloRemote1;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return helloRemote1.hello(name);
    }

}
