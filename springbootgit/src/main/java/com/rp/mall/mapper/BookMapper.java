package com.rp.mall.mapper;

import com.rp.mall.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from book limit #{page},3")
    List<Book> findByPage(Integer page);
}
