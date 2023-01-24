package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.js.dto.Book;

public class Bookdelete {
	final static String path = "com.mysql.cj.jdbc.Driver";
	final static String address = "jdbc:mysql://localhost:3306/jdbc2?user=root&password=Arnold@123";
	static Connection c;
public int DeleteBook(Book b) {
	
	try {
		Class.forName(path);
		c = DriverManager.getConnection(address);
		PreparedStatement ps = c.prepareStatement("delete from book_id ?");
		ps.setInt(1, b.getBook_id());
		return ps.executeUpdate();	
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return 0;
}
}


