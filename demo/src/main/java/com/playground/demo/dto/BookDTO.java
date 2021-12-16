package com.playground.demo.dto;

import com.playground.demo.models.Author;
import lombok.Data;

@Data
public class BookDTO {
    private long bookId ;
    private String bookName ;
    private Author author ;
}
