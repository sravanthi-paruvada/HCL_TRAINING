package com.bookstore.web;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookstore.dao.Book;
import com.bookstore.service.BookService;

public class MainBookStore {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beaans.xml");
	BookService bs=(BookService) ctx.getBean("bookService");
	//bs.addBook(new Book(5,"2623","HEad First Java","KAthy",700));
	bs.deleteBook(2);
	bs.getAllBooks().forEach(a->System.out.println(a));
	bs.updateBook(2, 600);
}
}
