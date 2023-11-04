plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.theokanning.openai-gpt3-java:service:0.11.1")
}

tasks.test {
    useJUnitPlatform()
}