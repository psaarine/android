package com.pyry.database;

import com.pyry.common.*;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.*;

public class DatabaseConfigurationSerializer implements ISerializer<DatabaseConfiguration> {

	public DatabaseConfiguration serialize(String input) {

		Json json = new Json();
		//return Json.decodeFromString<DatabaseConfiguration>(input);
		return null;
	
	}
}
