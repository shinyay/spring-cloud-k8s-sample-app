import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.3.0.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	id("com.gorylenko.gradle-git-properties") version "2.0.0"
	id("com.google.cloud.tools.jib") version "2.1.0"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
}

group = "com.google.shinyay"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

extra["springCloudVersion"] = "Hoxton.SR4"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-ribbon")
	implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
	implementation("org.springframework.cloud:spring-cloud-starter-sleuth")
	implementation("org.springframework.cloud:spring-cloud-starter-kubernetes-all")
	implementation("io.springfox:springfox-swagger2:2.9.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

val project_id = if (hasProperty("project_id")) findProperty("project_id") as String else ""

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootBuildImage>("bootBuildImage") {
	builder = "cloudfoundry/cnb:bionic"
	imageName = "docker.io/${project_id}/${project.name}:${project.version}"
}

val username= if (hasProperty("username")) findProperty("username") as String else ""
val password = if (hasProperty("password")) findProperty("password") as String else ""

jib {
	from {
		image = "shinyay/adoptopenjdk11-minimum"
	}
	to {
		image = "registry.hub.docker.com/${project_id}/spring-boot-kubernetes-gs:${version}"
//        auth.username = $username
//        auth.password = $password
	}
	container {
		jvmFlags = mutableListOf("-Xms512m", "-Xdebug")
		creationTime = "USE_CURRENT_TIMESTAMP"
	}
}

springBoot {
	buildInfo()
}