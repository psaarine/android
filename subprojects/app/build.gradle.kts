plugins {

	application
}

application {

	mainClass = "com.testing.AppMain"
}

sourceSets {
	main {
		java {
			setSrcDirs(listOf("src"))
		}
	}
}
