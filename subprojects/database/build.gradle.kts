plugins {
	application
}

repositories {
	mavenCentral()
}
dependencies {
	implementation("org.xerial:sqlite-jdbc:3.53.4.0")
	implementation(project(":common"))
	implementation(libs.kotlinx.serialization.json)
}

application {
	mainClass = "com.pyry.database.DBMain"
}

sourceSets {

	main {

		java {
			setSrcDirs(listOf("src"))
		}
	}
}
