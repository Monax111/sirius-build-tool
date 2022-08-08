plugins{
    java
    id("org.springframework.boot") version "2.7.2"
    jacoco
}

group = "ru.tinkoff.sirius.build.tools"
version = "1.0"

java{
    toolchain{
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}


repositories {
    mavenCentral()
}

dependencies {

    implementation(platform("org.springframework.cloud:spring-cloud-dependencies:2021.0.3"))
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.2"))

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(group = "org.postgresql", name = "postgresql", version = "42.4.0")
    implementation(group = "org.testcontainers", name = "postgresql", version = "1.17.3")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
