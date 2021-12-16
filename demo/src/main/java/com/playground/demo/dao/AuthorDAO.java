package com.playground.demo.dao;

import com.playground.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDAO extends JpaRepository<Author, Long> {
}
