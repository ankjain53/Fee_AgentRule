// Database Connection requires a Connector Object to connect to database & DriverManager to pass Credentials

package com.ril.Feedzai.Utility;
import java.sql.Connection;
import java.sql.DriverManager; // To pass Database Credentials 
import java.sql.ResultSet;
import java.sql.SQLException; //Executing an SQL Statement
import java.sql.Statement;



public class Database {
	
	public static String GetOtp() {
		
	
		try {
			
			String Host ="jdbc:oracle:thin:@10.130.237.17:1521:FIDCS";
			String UserId = "FDCMAWPD";
			String Pwd = "fdcmawpd";
			Connection con = DriverManager.getConnection(Host,UserId,Pwd); // Database Connection requires a Connector Object to connect to database & DriverManager to pass url  Credentials
			System.out.println("Connection successful");
			
			//For Executing SQL Statement
			Statement stmt = con.createStatement( );  // Create a Statement obj which requires a Connection Obj with createStatement()
			String SQL = "SELECT * FROM Workers";
			//method of the Statement object called executeQuery (searches all records)
			// executeQuery returns the records in form of Resultset
			ResultSet rs = stmt.executeQuery( SQL ); // Resultset object holds all the records of the database
		}
		catch(SQLException err) {
			
		}
		return null;
		
	}

}
