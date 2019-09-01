package com.example.bookstoreproject.domain;

public class Book {
private String title, author;
private Integer year, isbn, price;

public Book(String title, String author, Integer year, Integer isbn, Integer price) {
	super();
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
}

public Book() {
	super();
	
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public Integer getYear() {
	return year;
}

public void setYear(Integer year) {
	this.year = year;
}

public Integer getIsbn() {
	return isbn;
}

public void setIsbn(Integer isbn) {
	this.isbn = isbn;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}

@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
			+ "]";
}

	
}
