package com.ruddyrex.teamproject.RuddyRex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnDb {

    private static String jdbcURL = "jdbc:hsqldb:/localhost/ruddyrex";
    private static String jdbcUsername = "sa";
    private static String jdbcPassword = "";

    public static Connection getConnection() throws ClassNotFoundException {
        Connection connection = null;
        try {
        	Class.forName("org.hsqldb.jdbcDriver");
        	test();
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    private static void test() throws SQLDataException {
		// TODO Auto-generated method stub
		
	}

	public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}