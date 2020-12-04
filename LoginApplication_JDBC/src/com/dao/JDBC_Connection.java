/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sunil
 *
 */
public class JDBC_Connection {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection connection = null;
		// JDBC driver name and database URL
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/hcl?autoReconnect=true&useSSL=false";

		// Database credentials
		final String USER = "root";
		final String PASS = "SunilKumar@123";
		Class.forName(JDBC_DRIVER);
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		return connection;
	}
}
