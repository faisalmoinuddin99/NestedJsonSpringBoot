package com.playground.demo.services;

import com.playground.demo.dao.BookDAO;
import com.playground.demo.dto.BookDTO;
import com.playground.demo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    BookDAO bookDAO ;

    public List<BookDTO> getAllBookDetails(){
        return bookDAO.findAll()
                .stream()
                .map(this::convertEntityToDTO).collect(Collectors.toList());
    }



    public BookDTO convertEntityToDTO(Book book){
        BookDTO bookDTO = new BookDTO() ;
        bookDTO.setBookName(book.getBookName());
        bookDTO.setAuthor(book.getAuthor());

        return bookDTO ;
    }

    public Book convertToBookEntity(BookDTO bookDTO) {
        Book book = new Book() ;
        book.setBookName(bookDTO.getBookName());
        book.setAuthor(bookDTO.getAuthor());

        return book ;
    }

}
