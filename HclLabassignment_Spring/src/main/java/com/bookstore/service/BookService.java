package com.bookstore.service;

import java.util.List;

import com.bookstore.dao.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, double price);
	public void getBookById(int id);

}
