package com.solux.greenish.search.config;
import com.solux.greenish.search.contoller.PlantSearchController;
import com.solux.greenish.search.repository.service.PlantService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Appconfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PlantService plantService(){
        return new PlantService(restTemplate());
    }

    @Bean
    public PlantSearchController plantSearchController(){
        return new PlantSearchController(plantService());
    }
}
