package com.bookstore.dao;
import java.util.*;
public interface BookDao {
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public void deleteBook(int id);
	public void updateBook(int id, double price);
	public Book getBookById(int id);


}
