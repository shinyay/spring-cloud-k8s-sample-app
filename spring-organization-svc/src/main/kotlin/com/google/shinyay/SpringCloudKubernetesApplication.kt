package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudKubernetesApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudKubernetesApplication>(*args)
}
