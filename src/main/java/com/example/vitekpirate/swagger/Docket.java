package com.example.vitekpirate.swagger;

import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;

@Component
public class Docket {

    public springfox.documentation.spring.web.plugins.Docket api() {
        return new springfox.documentation.spring.web.plugins.Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
