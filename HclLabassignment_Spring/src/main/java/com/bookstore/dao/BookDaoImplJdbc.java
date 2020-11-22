package com.bookstore.dao;

import java.util.*;

import java.sql.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bookstore.dao.exceptions.DataAccessException;
@Primary
@Repository
public class BookDaoImplJdbc implements BookDao{
	private DataSource dataSource;
	List<Book> books=new ArrayList<>();
	Book book=null;
	@Autowired
	public BookDaoImplJdbc(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}

	
	@Override
	public List<Book> getAllBooks() {
		
		try {
			Connection connection=dataSource.getConnection();
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from book");
			while(rs.next()) {
				book=new Book(rs.getInt("id"),
						rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"),
						rs.getDouble("price"));
				books.add(book);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return books;
	}

	@Override
	public Book addBook(Book book) {
		PreparedStatement pstmt;
		String add_query = "insert into books(isbn, title, author, pubDate, price) values(?, ?, ?, ?, ?)";
		
		try {
			Connection connection=dataSource.getConnection();
			pstmt = connection.prepareStatement(add_query);
			pstmt.setInt(2, book.getId());
			pstmt.setString(2, book.getIsbn());
			pstmt.setString(3, book.getTitle());
			pstmt.setString(4, book.getAuthor());
			pstmt.setDouble(5, book.getPrice());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			//throw new DataAccessException(e.getMessage());
		}
		return book;
		
	}

	@Override
	public void deleteBook(int id) {
		Book bookToBeDeleted = getBookById(id);
		String delete_book_query = "delete from books where id = ?";
		
		PreparedStatement pstmt;
		try {	
			Connection connection=dataSource.getConnection();
			pstmt = connection.prepareStatement(delete_book_query);
			pstmt.setInt(1, id);
			
			pstmt.execute();
			
			
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		
           System.out.println("Deleted !");
	
	}

	@Override
	public void updateBook(int id, double price) {
		Book bookToBeUpdated = getBookById(id);
		String add_book_query =
				"update books set price = ? where id = ?";
		
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(add_book_query);
			
			pstmt.setDouble(1, price);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		bookToBeUpdated.setPrice(price);
		  System.out.println("Updated ! ");;
		
		
	}

	@Override
	public Book getBookById(int id) {
	String get_book_by_id = "select * from books where id = ?";
		
		PreparedStatement pstmt;
		try {
			Connection connection=dataSource.getConnection();
			pstmt = connection.prepareStatement(get_book_by_id);
			pstmt.setInt(1,id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				book = new Book(rs.getInt("id"),
						rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"), 
						rs.getDouble("price"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		
		return book;
	}

}
