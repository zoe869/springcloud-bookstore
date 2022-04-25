package com.tus.bookstore.product.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

//    @Value("${url}")
//    private String url;

    @GetMapping("/config/url")
    public String testConfigServer(){
        return "url";
    }
}
