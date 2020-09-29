package com.sergio.javacourse.misc;

import java.util.ArrayList;
import java.util.List;

public class Book {

	public String author;
	public String title;
	
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}
	
	public static List<Book> buildBooks() {
		var books = new ArrayList<Book>();
		books.add(new Book("Dan Brown", "DaVinci Code"));
		books.add(new Book("Rowling", "Harry Potter"));
		books.add(new Book("Bram Stocker", "Dracula"));
		books.add(new Book("George R. R. Martin", "Game of Thrones"));
		return books;
	}
}
