package com.rudecrab.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enable}")
    private boolean enable;

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .apiInfo(apiInfo())
                .select()

                .apis(RequestHandlerSelectors.basePackage("com.rudecrab.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Parameter checksum unified exception handling Demo")
                .description("Used to demonstrate parameter checksum unified exception handling")
                .termsOfServiceUrl("tatiana.com")
                .contact(new Contact("Tatiana", "", "tatiana.com"))
                .version("1.0")
                .build();
    }
}
