package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dao.Book;
import com.bookstore.dao.BookDao;

@Service(value="bookService")
public class BookServiceImpl implements BookService{

	private BookDao dao;
	@Autowired
	public BookServiceImpl(BookDao dao) {
		this.dao = dao;
	}

	public void setDao(BookDao dao) {
		this.dao = dao;
	}


	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Book addBook(Book book) {
		
		return dao.addBook(book);

	}

	@Override
	public void deleteBook(int id) {
	
		dao.deleteBook(id);

	}

	@Override
	public void updateBook(int id, double price) {
	dao.updateBook(id, price);
		
	}

	@Override
	public void getBookById(int id) {
		dao.getBookById(id);
	
	}

}
