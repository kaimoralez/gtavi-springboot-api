package com.dt2.gtavi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("GTA VI API")
                        .version("1.0.0")
                        .description("API REST para gerenciamento de personagens, armas e veículos.")
                        .contact(new Contact()
                                .name("Kaique Pereira")
                                .email("kapconc2009@gmail.com")));
    }
}