package com.tus.bookstore.product.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("USER-SERVICE")
public interface UserController {
    @RequestMapping("/service/user1")
    public String feignTest();
}
