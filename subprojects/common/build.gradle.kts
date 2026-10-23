plugins {
	kotlin("jvm") version "2.4.21"
}

repositories {
	mavenCentral()
}
sourceSets.main {
	java.srcDirs("src")
}

dependencies {
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
}
