package com.seleniumjdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static String InsertQuery = "insert into urls(url) values(?)";
	public static void DatabaseInsert(String url) {
		try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_db","root", "root");
	
				
		PreparedStatement stmt = con.prepareStatement(InsertQuery);
		
		stmt.setString(1,url);
		
		stmt.executeUpdate();
		
			
				con.close();
	
		}catch(Exception e) {System.out.println(e);}
	
		

		}		  

}

