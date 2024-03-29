package com.example.bookstoreproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstoreproject.domain.Book;
import com.example.bookstoreproject.domain.BookRepository;
import com.example.bookstoreproject.domain.Category;
import com.example.bookstoreproject.domain.CategoryRepository;
import com.example.bookstoreproject.domain.User;
import com.example.bookstoreproject.domain.UserRepository;

@SpringBootApplication
public class BookstoreprojectApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreprojectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreprojectApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository brepository, CategoryRepository crepository,
			UserRepository urepository) {
		return (args) -> {
			log.info("save a book");
			crepository.save(new Category("fiction"));

			brepository.save(new Book("title", "author", 2005, 1234, 20, crepository.findByname("fiction").get(0)));
			// String title, String author, Integer year, Integer isbn, Integer price

			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);

			log.info("fetch all books");
			for (Book book : brepository.findAll()) {
				log.info(book.toString());
			}

		};

	}
}
