package com.zl.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() throws InterruptedException{
//        Thread.sleep(10000L);
//        String services = "Services: " + discoveryClient.getServices();
//        System.out.println(services);
        String services = "[testName: zl]";
        return services;
    }
}
