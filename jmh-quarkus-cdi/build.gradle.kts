import org.gradle.internal.impldep.bsh.commands.dir
import org.jetbrains.kotlin.fir.types.jvm.buildJavaTypeRef

plugins {
    kotlin("jvm") version "2.0.21"
    kotlin("plugin.allopen") version "2.0.21"
    id("io.quarkus")
    id("java")

    id("me.champeau.jmh") version "0.7.2"
    id("com.gradleup.shadow") version "9.0.0-beta2"
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc")
    implementation("io.quarkus:quarkus-rest")
    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured")

    implementation("org.openjdk.jmh:jmh-core:1.37")
    implementation("org.openjdk.jmh:jmh-generator-annprocess:1.37")

    jmh("org.openjdk.jmh:jmh-core:1.37")
    jmh("org.openjdk.jmh:jmh-generator-annprocess:1.37")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.37")

    implementation(files("build/libs/jmh-quarkus-cdi-1.0.0-SNAPSHOT.jar"))
}

group = "org.acme"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
}
allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.enterprise.context.ApplicationScoped")
    annotation("jakarta.persistence.Entity")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_21.toString()
    kotlinOptions.javaParameters = true
}

tasks.register("jmhPrepare") {
    doLast {
        ant.withGroovyBuilder {
            "copy"("todir" to "build/libs/tmp") {
                "fileset"("dir" to "build/jmh-generated-sources") {
                    "include"("name" to "**")
                }
            }
            "copy"("todir" to "build/libs/tmp") {
                "fileset"("dir" to "build/jmh-generated-resources") {
                    "include"("name" to "**")
                }
            }
            "unzip"(
                "src" to "build/libs/${rootProject.name}-${rootProject.version}.jar",
                "dest" to "build/libs/tmp"
            )
            "unzip"(
                "src" to "build/quarkus-app/quarkus/generated-bytecode.jar",
                "dest" to "build/libs/tmp"
            )
            "zip"(
                "basedir" to "build/libs/tmp",
                "destfile" to "build/libs/${rootProject.name}-${rootProject.version}.jar"
            )
        }
    }
}

tasks.shadowJar {
    outputs.upToDateWhen { false }
    archiveBaseName = "benchmarks"
    archiveClassifier = ""
    archiveVersion = ""

    manifest {
        attributes.put("Main-Class", "org.openjdk.jmh.Main")
    }
}

tasks.quarkusDependenciesBuild {
    dependsOn("jar")
}