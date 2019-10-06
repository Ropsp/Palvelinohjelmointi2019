package com.example.bookstoreproject;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookstoreproject.domain.Book;
import com.example.bookstoreproject.domain.Category;
import com.example.bookstoreproject.domain.CategoryRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryTest {

	@Autowired
	private CategoryRepository repository;
	
	@Test
	public void findBycategoryShouldReturnName() {
		List <Category> categorys = repository.findByname("fiction");
		assertThat(categorys).hasSize(1);
	}
	@Test
	public void createNewCategory() {
		Category category = new Category ("scifi");
		repository.save(category);
		assertThat(category.getCategoryid()).isNotNull();
	}
	
}
