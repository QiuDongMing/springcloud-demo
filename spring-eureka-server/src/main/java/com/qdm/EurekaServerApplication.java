package com.qdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author QiuDongMing 2018年01月09日 17:18
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootConfiguration

public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
