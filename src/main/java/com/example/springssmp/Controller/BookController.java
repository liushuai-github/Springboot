package com.example.springssmp.Controller;

import com.example.springssmp.Service.BookService;
import com.example.springssmp.domain.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<book> show(book b){
        System.out.println(b);
        List<book> list = bookService.list();

        return list;
    }

    @GetMapping("{id}")
    public book selById(@PathVariable("id") int i){
        book book = bookService.getById(i);
        return book;
    }

//    @GetMapping("{name}/{price}")
//    public void save(@PathVariable String name,int price){
//        book book=new book();
//        System.out.println(name);
//        System.out.println(price);
//        System.out.println(book);
//        bookService.save(book);
//    }



}
