package com.ricardosmithco.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FriendFactory {
	
	// let's create a singleton factory:
	
	private static FriendFactory ff = new FriendFactory(); // private static instance of itself
	
	private FriendFactory() {
		super();
	}
	
	public static synchronized FriendFactory getInstance() { // synchronized method preventing 
		if(ff == null) {
			ff = new FriendFactory();
		}
		return ff;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		
		try {
//			InputStream stream = this.getClass().getResourceAsStream("/database.properties");
//			prop.load(stream);
			prop.load(new FileReader("database.properties"));
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(
					prop.getProperty("url"),
					prop.getProperty("usr"),
					prop.getProperty("password"));
					
		} catch (FileNotFoundException error) {
			error.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
