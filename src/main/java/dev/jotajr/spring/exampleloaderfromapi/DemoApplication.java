package dev.jotajr.spring.exampleloaderfromapi;

import dev.jotajr.spring.exampleloaderfromapi.beans.omdb.OmdbBean;
import dev.jotajr.spring.exampleloaderfromapi.services.OmdbApiService;
import dev.jotajr.spring.exampleloaderfromapi.services.SimpleApiRequestJsonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    private final SimpleApiRequestJsonService simpleApiRequestJsonService;

    final OmdbApiService omdbApiService;

    @Autowired
    public DemoApplication(SimpleApiRequestJsonService simpleApiRequestJsonService, OmdbApiService omdbApiService) {
        this.simpleApiRequestJsonService = simpleApiRequestJsonService;
        this.omdbApiService = omdbApiService;
    }

    public static void main(String[] args) {
        LOGGER.info("Iniciando a aplicacao");
        SpringApplication.run(DemoApplication.class, args);
        LOGGER.info("Final da execucao da aplicacao");
    }

    @Override
    public void run(String... args) throws Exception {

        simpleApiRequestJsonService.fazerRequestSimplesUtilizandoApiWeather();

        String idFilmeOmdb = "tt3896198";

        LOGGER.info("Teste do OMDB");
        OmdbBean omdbBean = omdbApiService.getOmdbData(idFilmeOmdb);
        LOGGER.info(omdbBean.toString());


    }
}
