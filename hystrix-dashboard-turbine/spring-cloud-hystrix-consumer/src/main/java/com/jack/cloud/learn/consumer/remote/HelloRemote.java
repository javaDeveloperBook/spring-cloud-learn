package com.jack.cloud.learn.consumer.remote;

import com.jack.cloud.learn.consumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: JackWu
 * @create: 2018-12-25 14:42
 **/
@FeignClient(value = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    /**
     *
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
