package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author bj.brassard
 *
 * This utility class is designed to quickly grab a quick connection to the Database
 */
public class ConnectionUtil {

	public Connection getNewConnection() throws SQLException{
		
		return DriverManager.getConnection(
				/*
				 * We have to grab these from my computer, I'll figure this out later
				 * today
				 */
				System.getenv("nameOfEnvironentVariableURL"),
				System.getenv("Username"),
				System.getenv("Password"));
		
		
	}
}
