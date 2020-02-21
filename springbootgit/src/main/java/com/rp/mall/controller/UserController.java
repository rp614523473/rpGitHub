package com.rp.mall.controller;

import com.rp.mall.domain.User;
import com.rp.mall.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
     private UserServiceImpl userService;

    @RequestMapping("/hello")
    public String  sayHello()
    {
        return "hello springboot_git";
    }

    @RequestMapping("/find")
    public List<User> find() {
        List<User> list = this.userService.findAll();
        System.out.println(list);
        return list;
    }
}
