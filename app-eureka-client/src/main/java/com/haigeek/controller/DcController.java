package com.haigeek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohj
 * @date 2019/1/26 下午3:33
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        //获取服务列表
        String services="Services:"+discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
