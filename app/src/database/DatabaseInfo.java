package com.pyry.springApp.database;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

public class DatabaseInfo {

	public String getConnectionString() {
	
		String connectionString = getPostgresqlBase();
		connectionString = connectionString + this.database;

		return connectionString;
	}

	private String getPostgresqlBase() {
	
		return "jdbc:postgresql:";
	}
	private String user;

	public String getUser() {
	
		return user;
	}

	public void setUser(String user) {
	
		this.user = user;
	}

	private String password;

	public String getPassword() {
	
		return password;
	}

	public void setPassword(String password) {
	
		this.password = password;
	}

	private String database;

	public String getDatabase() {
	
		return database;
	}

	public void setDatabase(String database) {
	
		this.database = database;
	}

	private String getPasswordPart() {
	
		if (this.password == null) {
		
			return "";
		}

		return String.format("password=%s", this.password);
	}

	private String getDatabasePart() {
	
		return String.format("dbname=%s", this.database);
	}

	private String getUserPart() {
	
		return String.format("user=%s", this.database);
	}

	private String getHostPart() {
	
		return String.format("host=%s", "localhost");
	}
}
