package com.example.bookstoreproject.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/index")
	public String bookList (Model model) {
		return "index";
	}
	
}
