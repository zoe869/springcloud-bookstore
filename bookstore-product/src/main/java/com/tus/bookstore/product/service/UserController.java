package com.tus.bookstore.product.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="USER-SERVICE")
public interface UserController {
    @GetMapping("/service/user1")
    public String feignTestUserService();
}
