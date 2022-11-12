package com.ruddyrex.teamproject.RuddyRex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
  public static void main(String[] args) {
	  ResultSet result = null;
		
		 try {
				 Class.forName("org.hsqldb.jdbcDriver");
				  
				 Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql//localhost/testdb", "SA", "");
	
				 Statement stmt = con.createStatement();
				
				 
				result = stmt.executeQuery("CREATE TABLE older (id INT NOT NULL)");
				 
				 //ResultSet rs = stmt.executeQuery("select * from users");
				 
				 System.out.println(result);
			  
			 con.close();
			  
			 } catch (ClassNotFoundException | SQLException e) {
			 e.printStackTrace();
			 }
	  
  }
}
