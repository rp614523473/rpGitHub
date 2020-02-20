package com.rp.mall.controller;

import com.rp.mall.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/hello")
    public String  sayHello()
    {
        return "hello springboot_git";
    }
}
