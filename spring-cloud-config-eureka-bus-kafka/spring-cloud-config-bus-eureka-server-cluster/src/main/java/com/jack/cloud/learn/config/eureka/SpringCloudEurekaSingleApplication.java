package com.jack.cloud.learn.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author Jackwu
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaSingleApplication.class, args);
    }

}

