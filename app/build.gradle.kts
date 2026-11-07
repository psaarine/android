plugins {
	java
	id("org.springframework.boot") version "4.1.2"
}
dependencies {
	implementation("org.springframework.boot:spring-boot")
	implementation("org.springframework.boot:spring-boot-autoconfigure")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.postgresql:postgresql:42.7.14")
}

apply(plugin = "io.spring.dependency-management")

repositories {
	mavenCentral()
}
sourceSets {

	main {
		java {
			setSrcDirs(listOf("src"))
		}
	}
}
