package com.rp.mall.mapper;

import com.rp.mall.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
   /* @Results(id = "tb_user" ,value = {
            @Result(property = "uid",column = "id"),
            @Result(property = "userAddress",column = "phone")
    })*/
    @Select("select * from tb_user")
    List<User> findAll();



}
