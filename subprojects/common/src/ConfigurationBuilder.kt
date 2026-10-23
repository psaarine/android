package com.pyry.common;

import kotlinx.serialization.Serializable;
import kotlin.io.path.Path;
import java.io.File;
import java.nio.file.Files;

interface ISerializer<out T> {
	fun serialize(input: String): T
}

interface IPropertiesMapper<out T> {
	fun mapFrom(input: SystemPropertiesProvider): T
}

public class ConfigurationProvider<out Type>  (serializer: ISerializer<Type>, locations: List<String>, prefix: String) {

	val serializer: ISerializer<Type> = serializer;
	val locations: List<String> = locations;
	val prefix: String = prefix;

	fun tryGet(): Type? {

		for (location in locations) {
			val completePath: java.nio.file.Path = getConfigurationFileCompletePath(location);
			val pathAsFile: File = completePath.toFile();
			System.out.println("Searching for file " + completePath.toString());
			if (pathAsFile.exists()) {

				System.out.println("Found configuration path at " + completePath.toString());
				return serializer.serialize(Files.readString(completePath));
			}
		}

		return null;
	}

	private fun getConfigurationFileCompletePath(location:String): java.nio.file.Path {
		return Path(location, "$prefix.appsettings.json");
	}
}

public class SystemPropertiesProvider(namespace: String?) {

	val namespace: String? = namespace
	fun <T> tryMap(mapper: IPropertiesMapper<T>): T {

		return mapper.mapFrom(this)
	}

	fun mandatoryProperty(key: String): String? {

		var completeKey: String? = null
		if (namespace.isNullOrEmpty()) {
			completeKey = key
		}else {
			completeKey = namespace + ".$key"
		}
		return System.getProperty(completeKey)

	}
}
