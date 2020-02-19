/**
 * 
 */
package com.rtest.dashboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
/**
 * @author rajk0517
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rtest.dashboard.controller"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
    	return new ApiInfoBuilder()
                .title("rTestResults REST API")
                .description("\"rTestResults REST API for Online Store\"")
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(new Contact("Rajiv Kumar", "https://springframework.guru/about/", "rajeksingh2@gamil.com"))
                .build();
       
    }
}
