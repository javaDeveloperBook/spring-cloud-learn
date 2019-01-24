package com.jack.cloud.lean.zuul.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Jackwu
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayServiceZuulSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceZuulSimpleApplication.class, args);
    }

}

