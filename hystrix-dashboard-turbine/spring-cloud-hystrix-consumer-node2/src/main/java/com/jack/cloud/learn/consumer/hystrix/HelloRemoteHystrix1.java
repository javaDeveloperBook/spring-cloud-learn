package com.jack.cloud.learn.consumer.hystrix;

import com.jack.cloud.learn.consumer.remote.HelloRemote1;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: JackWu
 * @create: 2018-12-25 16:32
 **/
@Component
public class HelloRemoteHystrix1 implements HelloRemote1 {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name + "! this is hystrix.";
    }
}
