package dev.jotajr.spring.exampleloaderfromapi;

import dev.jotajr.spring.exampleloaderfromapi.services.SimpleApiRequestJsonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    private final SimpleApiRequestJsonService simpleApiRequestJsonService;

    @Autowired
    public DemoApplication(SimpleApiRequestJsonService simpleApiRequestJsonService) {
        this.simpleApiRequestJsonService = simpleApiRequestJsonService;
    }

    public static void main(String[] args) {
        LOGGER.info("Iniciando a aplicacao");
        SpringApplication.run(DemoApplication.class, args);
        LOGGER.info("Final da execucao da aplicacao");
    }

    @Bean
    public CommandLineRunner run() {
        return args -> simpleApiRequestJsonService.fazerRequestSimplesUtilizandoApiWeather();
    }

}
