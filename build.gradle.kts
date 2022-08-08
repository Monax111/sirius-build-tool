plugins{
    java
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
    implementation("com.google.code.gson:gson:2.9.1")
}