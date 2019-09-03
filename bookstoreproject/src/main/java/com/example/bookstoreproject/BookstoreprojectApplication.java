package com.example.bookstoreproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstoreproject.domain.Book;
import com.example.bookstoreproject.domain.BookRepository;



@SpringBootApplication
public class BookstoreprojectApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreprojectApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a book");
			repository.save(new Book("title", "author", 2005, 1234, 20));
			//String title, String author, Integer year, Integer isbn, Integer price
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	
}
}
