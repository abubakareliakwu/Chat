package com.example.Chat.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@EnableSwagger2
public class SwaggerConfig {

   /** @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }*/


   @Bean
   public OpenAPI springShopOpenAPI() {
       return new OpenAPI()
               .info(new Info().title("SignUp API")
                       .description("Authentication service")
                       .version("v0.0.1"));
   }


}