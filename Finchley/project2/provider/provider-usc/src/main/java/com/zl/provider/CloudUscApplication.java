package com.zl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableDiscoveryClient
@SpringBootApplication
public class CloudUscApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudUscApplication.class, args);
    }
}
