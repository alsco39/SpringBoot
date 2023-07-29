import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version PluginVersions.SPRING_VERSION
    id("io.spring.dependency-management") version PluginVersions.DEPENDENCY_MANAGEMENT
    kotlin("jvm") version PluginVersions.JVM
    kotlin("plugin.spring") version PluginVersions.SPRING_PLUGIN
    kotlin("plugin.jpa") version PluginVersions.JPA_PLUGIN
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
    implementation(Dependencies.JACKSON)
    implementation(Dependencies.VALIDATION)
    implementation(Dependencies.WEB)
    implementation(Dependencies.SECURITY)
    implementation(Dependencies.JPA)
    implementation(Dependencies.QUERYDSL)
    implementation(Dependencies.QUERYDSL_PROCESSOR)
    runtimeOnly(Dependencies.MYSQL)
    implementation(Dependencies.REDIS)
    implementation(Dependencies.CONFIGURATION_PROCESSOR)
    implementation(Dependencies.WEBFLUX)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
    annotation("com.pickdsm.pickserverspring.global.annotation.NoArg")
}

