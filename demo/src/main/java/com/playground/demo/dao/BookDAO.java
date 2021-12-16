package com.playground.demo.dao;

import com.playground.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDAO extends JpaRepository<Book, Long> {
}
