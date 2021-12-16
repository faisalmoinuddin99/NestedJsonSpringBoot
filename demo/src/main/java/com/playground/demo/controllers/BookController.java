package com.playground.demo.controllers;

import com.playground.demo.dto.BookDTO;
import com.playground.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService ;

    @GetMapping("/books")
    public List<BookDTO> getAllBooksDetails(){
        return bookService.getAllBookDetails() ;
    }
}
