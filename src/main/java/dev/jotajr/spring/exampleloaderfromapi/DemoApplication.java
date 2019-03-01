package dev.jotajr.spring.exampleloaderfromapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import dev.jotajr.spring.exampleloaderfromapi.beans.Weather;

@SpringBootApplication
public class DemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    // Weather do Rio de Janeiro
    private final String URL_API_GET = "https://www.metaweather.com/api/location/455825/";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {

            LOGGER.info("Realizando requisicao para: {}", URL_API_GET);

            Weather weather = restTemplate.getForObject(URL_API_GET, Weather.class);

            LOGGER.info("Resposta: ");
            LOGGER.info(weather.toString());
        };
    }

}
