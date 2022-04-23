package com.tus.bookstore.user.controller;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @GetMapping("/service/user1")
    public String helloUserService(){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "hello helloUserService";
    }
}
