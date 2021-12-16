package com.playground.demo;

import com.playground.demo.dao.AuthorDAO;
import com.playground.demo.dao.BookDAO;
import com.playground.demo.models.Author;
import com.playground.demo.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	AuthorDAO authorDAO ;

	@Autowired
	BookDAO bookDAO ;

	@Override
	public void run(String... args) throws Exception {

		Author author1 = new Author() ;
		author1.setAuthorFirstName("Leo");
		author1.setAuthorLastName("Messi");
		authorDAO.save(author1) ;


		Book book1 = new Book();
		book1.setAuthor(author1);

		book1.setBookName("Football basics");
		bookDAO.save(book1) ;


	}
}
