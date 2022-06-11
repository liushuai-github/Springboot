package com.example.springssmp.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springssmp.Dao.BookDao;
import com.example.springssmp.Service.BookService;
import com.example.springssmp.domain.book;

@org.springframework.stereotype.Service
public class Service extends ServiceImpl<BookDao, book> implements BookService {
}
