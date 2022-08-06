package com.projects.lamarkets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.project.lamarket"))
                .paths(PathSelectors.ant("/**"))
                .build();
    }
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "La Markets REST API",
                "Documentation of API for team development.",
                "API Tos",
                "Terms of service",
                new Contact("Christine Meilana", "www.lamarkets.com", "christine252@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
