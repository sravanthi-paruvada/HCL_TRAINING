package com.bookApp;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class BookTest{
	private Book book;
	private BookDao bookDao;
	

	@Before
	public void setUp() throws Exception {
		bookDao=new BookDaoImpl();
		book=new Book(1, "Head First Java", "Kathy Sierra", 500);
	}
	@Test
	public void getAllBookstest() {
		int k=bookDao.getAllBooks().size();
		Assert.assertEquals(1, k);
	
		
	}
	@Test
	public void updateBooktest() {
		Assert.assertNotNull(bookDao.updateBook(1, 50));
		
	}

	@Test
	public void deleteBooktest() {
		Assert.assertNotNull(bookDao.deleteBook(1));
		
	}

	@Test
	public void addBooktest() {
		bookDao.addBook(book);
		int k=bookDao.getAllBooks().size();
		Assert.assertEquals(1, k);
		
	}
	@After
	public void tearDown() throws Exception {
		bookDao=null;
		book=null;
	}


}

