package com.tus.bookstore.user.service;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestUserController {



    @GetMapping("/service/user1")
    public String helloUserService(){

        return "hello helloUserService";
    }
}
