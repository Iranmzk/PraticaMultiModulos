package br.com.javatech.yahoo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

    @Bean
    public RestTemplate restTemplateYahoo() {
        return new RestTemplateBuilder()
                .rootUri("https://apidojo-yahoo-finance-v1.p.rapidapi.com")
                .defaultHeader("X-RapidAPI-Host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
                .defaultHeader("X-RapidAPI-Key", "bdbd0f936bmshe7a392f9fa3452bp1f3ba9jsnfbe1a9455901")
//                .errorHandler(new ApiErrorHandler())
                .build();
    }
}
