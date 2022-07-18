package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC stands for Java DB Connectivity. Provides a standard interface for allowing
 * developers to connect their java applications to database
 * 
 * At its core, JDBC consists of several key classes and interfaces
 * 
 * DriverManager (class): Utility class that allows us to utilize the postgres server
 * Connection (interface)
 * Statement (interface)
 * ResultSet (interface)
 * SQLException (class)
 * 
 * Note that these are in face interfaces; this means they're abstract. As interfaces have no
 * implementations for their methods, we are required to provide implementations for key interfaces. There
 * is a standard Postgres JDBC library
 */
public class JDBCOverview {

	/*
	 * Let's attempt to connect to our DB from our Java Application
	 */
	public static void main(String[] args) {
		
		try {
			Connection conn = DriverManager.getConnection(
					/*
					 * We have to grab these from my computer, I'll figure this out later
					 * today
					 */
					System.getenv("nameOfEnvironentVariableURL"),
					System.getenv("Username"),
					System.getenv("Password"));
			
			/*
			 * After we have established a connection, we can execute SQL statements
			 * against our DB.
			 */
			
			Statement stmt = conn.createStatement();
			/*
			 * The ResultSet will store the results of a running query
			 */
			ResultSet set = stmt.executeQuery("select * from associates");
			
			// System.out.println(set);
			
			while(set.next()) {
				
				// While there is another record in the result set, we will print
				int id = set.getInt(1);
				String associateName = set.getString(1);
				String associateLocale = set.getString(2);
				String associateHobby = set.getString(3);
				int trainerID = set.getInt(5);
				
				System.out.println(id + ", " + associateName + ", " +
				associateHobby + ", " + trainerID);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
} 
