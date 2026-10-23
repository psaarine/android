plugins {
	kotlin("jvm") version "2.4.21"
	application
}

application {

	mainClass = "com.pyry.server.ServerMain"
}

sourceSets {
	main {
		java {
			setSrcDirs(listOf("src"))
		}
	}
}
repositories {
	mavenCentral()
}

dependencies {
	var ktorVersion = "3.6.0"
	implementation("io.ktor:ktor-server-core:$ktorVersion")
	implementation("io.ktor:ktor-server-netty:$ktorVersion")
}
