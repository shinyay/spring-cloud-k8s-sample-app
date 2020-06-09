package com.google.shinyay.config

import org.springframework.boot.info.BuildProperties
import org.springframework.boot.info.GitProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig(val build: BuildProperties, val git: GitProperties) {

    @Bean
    fun docApi(): Docket = Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfoBuilder()
                        .version("${build.version}-${git.shortCommitId}-${git.branch}")
                        .title("Employee API")
                        .description("Employee Service API - ${build.version}-${git.shortCommitId}-${git.branch}")
                        .build()
                )
}