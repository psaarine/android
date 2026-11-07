package com.pyry.springApp.database;

import org.springframework.stereotype.Component;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Component
public class QueryExecutor implements IQueryExecutor {

	private final String _connectionString;
	public QueryExecutor(DatabaseInfo info) {
		_connectionString = info.getConnectionString();
	}

	public List<T> executeQuery(ResultMapper<T> mapper) {
	
		Connection connection = null; 
		try {
			connection = DriverManager.getConnection(_connectionString);
		} catch (Exception ex) {
			System.out.println("Failed to get connection, connection string was " + _connectionString);
			System.out.println(ex.toString());
			return;
		}

		String query = "select * from users;";
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (Exception ex) {
			System.out.println("Failed to create statement from connection");
			System.out.println(ex.toString());
			tryCloseConnection(connection);
		}

		ResultSet result = null;

		try {
			result = statement.executeQuery(query);
		} catch (Exception ex) {
			System.out.println("Failed to execute query.");
			System.out.println("Query was " + query);
			System.out.println("Exception was " + ex.toString());
			tryCloseConnection(connection);
		}

		ArrayList<T> items = new ArrayList<T>();
		while (result.next()) {
			items.add(mapper(result));
		}

		return items;
	}

	private void tryCloseConnection(Connection connection) {

		if (connection == null) {
			return;
		}
	
		try {
			connection.close();
		} catch (Exception ex) {
		
			System.out.println("Failed to close connection");
			System.out.println(ex.toString());
		}
	}
}
