/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.appexception.UserException;
import com.appexception.UserNotFoundException;
import com.model.User;

/**
 * @author sunil
 *
 */
public class UserDaoImp implements UserDao {

	@Override
	public boolean createUser(User user) throws ClassNotFoundException, SQLException, UserException {
		JDBC_Connection jdbcConnection = new JDBC_Connection();
		Connection connection = jdbcConnection.getConnection();
		Statement statement = connection.createStatement();
		statement.execute("CREATE DATABASE IF NOT EXISTS hcl");
		statement.execute(
				"CREATE TABLE IF NOT EXISTS User(id INT NOT NULL,user_name VARCHAR(26) NOT NULL,password VARCHAR(50) NOT NULL,PRIMARY KEY(id))");
		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM User WHERE user_name =?");
		preparedStatement.setString(1, user.getUserName());
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next())
			if (!(resultSet.getInt(1) == 0))
				throw new UserException("User already exist try another user name");
		preparedStatement = connection.prepareStatement("INSERT INTO User (id,user_name,password) VALUES (?,?,?)");
		preparedStatement.setInt(1, user.getUserId());
		preparedStatement.setString(2, user.getUserName());
		preparedStatement.setString(3, user.getPassword());
		int row = preparedStatement.executeUpdate();
		System.out.println("created user:" + user.getUserName() + " with row " + row);
		preparedStatement.close();
		resultSet.close();
		statement.close();
		connection.close();
		jdbcConnection = null;
		return true;
	}

	@Override
	public User getUserWithId(int id) throws UserNotFoundException, ClassNotFoundException, SQLException {
		JDBC_Connection jdbcConnection = new JDBC_Connection();
		Connection connection = jdbcConnection.getConnection();
		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = null;
		preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM User WHERE id = (?)");
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next())
			if (resultSet.getInt(1) == 0)
				throw new UserNotFoundException("User not exist try another user id");
		preparedStatement = connection.prepareStatement("SELECT * FROM User WHERE id = (?)");
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		User user = new User();
		while (resultSet.next()) {
			// System.out.println("hii");
			user.setUserId(resultSet.getInt("id"));
			user.setUserName(resultSet.getString("user_name"));
			user.setPassword(resultSet.getString("password"));
		}
		// System.out.println(user.getPassword());
		resultSet.close();
		statement.close();
		connection.close();
		jdbcConnection = null;
		return user;
	}

	@Override
	public User getUserWithName(String name) throws UserNotFoundException, ClassNotFoundException, SQLException {
		JDBC_Connection jdbcConnection = new JDBC_Connection();
		Connection connection = jdbcConnection.getConnection();
		PreparedStatement preparedStatement = null;
		Statement statement = connection.createStatement();
		preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM User WHERE user_name = (?)");
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next())
			if (resultSet.getInt(1) == 0)
				throw new UserNotFoundException("User not exist try another user name");
		preparedStatement = connection.prepareStatement("SELECT * FROM User WHERE user_name = (?)");
		preparedStatement.setString(1, name);
		resultSet = preparedStatement.executeQuery();
		User user = new User();
		while (resultSet.next()) {
			user.setUserId(resultSet.getInt("id"));
			user.setUserName(resultSet.getString("user_name"));
			user.setPassword(resultSet.getString("password"));
		}
		resultSet.close();
		statement.close();
		connection.close();
		jdbcConnection = null;
		return user;
	}

	@Override
	public boolean updateUser(User user) throws SQLException, ClassNotFoundException, UserNotFoundException {
		JDBC_Connection jdbcConnection = new JDBC_Connection();
		Connection connection = jdbcConnection.getConnection();
		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM User WHERE id =(?)");
		preparedStatement.setInt(1, user.getUserId());
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next())
			if (resultSet.getInt(1) == 0)
				throw new UserNotFoundException("User not exist try another user name");
		preparedStatement = connection
				.prepareStatement("UPDATE User SET user_name = (?), password = (?) WHERE id = (?)");
		preparedStatement.setString(1, user.getUserName());
		preparedStatement.setString(2, user.getPassword());
		preparedStatement.setInt(3, user.getUserId());
		preparedStatement.executeUpdate();
		// System.out.println("User data updated successfully with row" + row);
		statement.close();
		connection.close();
		jdbcConnection = null;
		return true;
	}

	@Override
	public boolean deleteUserWithId(int id) throws UserNotFoundException, ClassNotFoundException, SQLException {
		JDBC_Connection jdbcConnection = new JDBC_Connection();
		Connection connection = jdbcConnection.getConnection();
		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM User WHERE id = ?");
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (!resultSet.first())
			throw new UserNotFoundException("User not exist try another user name");
		preparedStatement = connection.prepareStatement("DELETE FROM User WHERE id =?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		preparedStatement.close();
		statement.close();
		connection.close();
		jdbcConnection = null;
		return true;
	}

	@Override
	public boolean deleteUserWithName(String name) throws UserNotFoundException, SQLException, ClassNotFoundException {
		JDBC_Connection jdbcConnection = new JDBC_Connection();
		Connection connection = jdbcConnection.getConnection();
		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM User WHERE user_name = ?");
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (!resultSet.first())
			throw new UserNotFoundException("User not exist try another user name");
		preparedStatement = connection.prepareStatement("DELETE FROM User WHERE user_name =?");
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
		preparedStatement.close();
		statement.close();
		connection.close();
		jdbcConnection = null;
		return true;
	}

}
