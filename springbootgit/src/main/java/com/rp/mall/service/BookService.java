package com.rp.mall.service;

import com.rp.mall.domain.Book;
import com.rp.mall.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> findByPage(Integer page){
        page=(page-1)*3;
        return  this.bookMapper.findByPage(page);
    }

}
