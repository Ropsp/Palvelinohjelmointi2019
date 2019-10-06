package com.example.bookstoreproject;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookstoreproject.domain.BookRepository;
import com.example.bookstoreproject.domain.Category;
import com.example.bookstoreproject.domain.Book;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
	@Autowired
	private BookRepository repository;
	
	@Test
	public void findBytitleShouldReturnBook() {
		List <Book> books = repository.findBytitle("title");
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("author");
	}
	
	@Test
	public void createNewBook() {
		Book book = new Book("test", "book", 1, 2, 3, new Category("SCIENCE"));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	
}
