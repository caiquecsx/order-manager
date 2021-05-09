package com.caiquecsx.order.gateway.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.builders.ApiInfoBuilder

import springfox.documentation.service.ApiInfo




@Configuration
@EnableSwagger2
open class SpringFoxConfig {
    @Bean
    open fun api(): Docket{
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.caiquecsx.order.service.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(metaData())
    }

    private fun metaData(): ApiInfo? {
        return ApiInfoBuilder()
            .title("Order Manager CSX")
            .description("\"Made to manage any kind of order\"")
            .version("1.0.0")
            .license("Apache License Version 2.0")
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
            .build()
    }
}