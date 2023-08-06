import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.4.0'
}

plugins {
    checkstyle
}

group 'ru.job4j'
version '1.0'

repositories {
    mavenCentral()
}

dependencies {
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    testImplementation 'io.kotlintest:kotlintest-runner-junit5:3.3.2'
}

tasks.test {
    useJUnitPlatform()
}

test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

compileKotlin {
    kotlinOptions.jvmTarget = "12"
}
compileTestKotlin {
    kotlinOptions.jvmTarget = "12"
}
