plugins {
	java
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	// implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter")
	// implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.h2database:h2")
	runtimeOnly("com.oracle.database.jdbc:ojdbc8")
	implementation (group= "com.oracle.ojdbc", name= "orai18n", version= "19.3.0.0")
	implementation ("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.8.1")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	// testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
