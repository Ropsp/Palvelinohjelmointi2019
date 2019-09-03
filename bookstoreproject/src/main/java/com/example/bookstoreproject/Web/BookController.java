package com.example.bookstoreproject.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.bookstoreproject.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	public String listBooks() {
		return "";
	}
	
}
