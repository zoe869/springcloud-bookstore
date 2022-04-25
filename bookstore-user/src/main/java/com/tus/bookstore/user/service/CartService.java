package com.tus.bookstore.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 使用Feign绑定远程服务的
 */
@FeignClient(name="CART-SERVICE")
public interface CartService {
    @GetMapping("/cart/1")
    public String testFeign();
}

