plugins {
    java
}

group = "pl.richard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    implementation("mysql:mysql-connector-java:8.0.28")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}