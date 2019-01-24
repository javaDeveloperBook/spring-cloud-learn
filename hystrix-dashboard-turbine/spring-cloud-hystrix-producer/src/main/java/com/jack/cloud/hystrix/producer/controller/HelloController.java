package com.jack.cloud.hystrix.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: JackWu
 * @create: 2018-12-25 14:18
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name){
        return "Hello " + name + " ! this is first message.";
    }

}
