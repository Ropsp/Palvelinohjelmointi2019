package com.example.bookstoreproject.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bookstoreproject.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	public String listBooks() {
		return "";
	}
	@RequestMapping(value="/booklist")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist";
	}
	
}
