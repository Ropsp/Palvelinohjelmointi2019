package com.example.bookstoreproject;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookstoreproject.Web.BookController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookstoreprojectApplicationTests {

	@Autowired
	private BookController controller;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
