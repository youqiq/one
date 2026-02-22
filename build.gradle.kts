plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.example"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.recloudstream:cloudstream:master-SNAPSHOT")
}

tasks.jar {
    archiveExtension.set("cs3")
}