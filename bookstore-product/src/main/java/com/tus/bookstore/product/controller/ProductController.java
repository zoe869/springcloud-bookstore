package com.tus.bookstore.product.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@EnableEurekaClient
@RestController
public class ProductController {

    //test
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/service/product1")
    public String helloUserService(){
//        return restTemplate.getForEntity("http://localhost:10010/service/user1",String.class).getBody();
        return restTemplate.getForEntity("http://USER-SERVICE/service/user1",String.class).getBody();
    }

    @HystrixCommand(fallbackMethod ="error" )
    @GetMapping("/service/product1/hystrix")
    public String helloHystrix(){
//        return restTemplate.getForEntity("http://localhost:10010/service/user1",String.class).getBody();
        return restTemplate.getForEntity("http://USER-SERVICE/service/user1",String.class).getBody();
    }

    public String error() {
        return "error";
    }

}
