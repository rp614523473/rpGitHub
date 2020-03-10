package com.rp.mall.controller;

import com.rp.mall.domain.Book;
import com.rp.mall.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

   @Autowired
   private BookService bookService;

   @GetMapping("/find")
   public List<Book> findByPage(@RequestParam Integer page){
       return this.bookService.findByPage(page);
   }

    @RequestMapping("/hello")
    public String test(){
        return "helloWorld";
    }
}
