package com.tus.bookstore.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GatewayController {
    @GetMapping("/api/local")
    public String local() {

        System.out.println("在api gateway中执行业务逻辑处理.....");

        return "exec the api gateway.";
    }
}
