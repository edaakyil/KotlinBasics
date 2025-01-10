plugins {
    kotlin("jvm") version "2.0.20"
}

group = "com.edaakyil"
version = "1.0.0"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("com.edaakyil:com-edaakyil-kotlin-util-console:1.1.0")
    implementation("com.edaakyil:com-edaakyil-kotlin-math:1.0.0")
    testImplementation(kotlin("test"))
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.edaakyil.app.AppKt"
    }

    from(configurations.compileClasspath.map { config -> config.map { if (it.isDirectory) it else zipTree(it) } })
    duplicatesStrategy  = DuplicatesStrategy.EXCLUDE
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}