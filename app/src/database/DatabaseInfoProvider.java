package com.pyry.springApp.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.lang.NullPointerException;

@Configuration
@ConfigurationProperties("mydb")
public class DatabaseInfoProvider {

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

	@Bean
	public DatabaseInfo dbInfo() {
	
		if (this.user == null) {
		
			throw new NullPointerException("Database user must be defined");
		}
		if (this.database == null) {
		
			throw new NullPointerException("Must define target database with database property");
		}


		DatabaseInfo info = new DatabaseInfo();
		info.setDatabase(this.database);
		info.setUser(this.user);
		info.setPassword(this.password);

		return info;
	}
}
