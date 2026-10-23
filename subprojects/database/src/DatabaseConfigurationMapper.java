package com.pyry.database; 

import com.pyry.common.IPropertiesMapper;
import com.pyry.common.SystemPropertiesProvider;

public class DatabaseConfigurationMapper implements IPropertiesMapper<DatabaseConfiguration> {

	public DatabaseConfiguration mapFrom(input: SystemPropertiesProvider) {
	
		DatabaseConfiguration config = new DatabaseConfiguration();
		config.connectionString = input.mandatoryProperty("connectionString");

		return config;
	}

}
