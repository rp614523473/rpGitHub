package com.rp.mall.service;
import com.rp.mall.domain.User;
import com.rp.mall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        List<User> all = this.userMapper.findAll();
        return  all;

    }
}
