package com.bookApp;

import java.util.List;

public interface BookDao {
	List<Book> getAllBooks();
	Book updateBook( int id,int page );
	Book deleteBook( int id );
    void addBook(Book book );

}
