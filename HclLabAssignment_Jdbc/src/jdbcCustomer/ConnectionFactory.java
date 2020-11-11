package jdbcCustomer;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

public class ConnectionFactory {
	private static Connection connection=null;
	
	private ConnectionFactory() {}
	public static Connection getConnection() {
		InputStream is = ConnectionFactory.class
										   .getClassLoader()
										   .getResourceAsStream("db.properties");
		
		Properties properties =new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String driver = properties.getProperty("db.driver");
		String url = properties.getProperty("db.url");
		String username = properties.getProperty("db.username");
		String password = properties.getProperty("db.password");
		
		try {
			Class.forName(driver);
			System.out.println("Driver is loaded...");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection =DriverManager.getConnection(url,username,password);
		}
		 catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		return connection;
		}
		
		
	}
	