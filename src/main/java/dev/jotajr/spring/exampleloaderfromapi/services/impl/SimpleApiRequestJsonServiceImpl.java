package dev.jotajr.spring.exampleloaderfromapi.services.impl;

import dev.jotajr.spring.exampleloaderfromapi.beans.weather.Weather;
import dev.jotajr.spring.exampleloaderfromapi.services.SimpleApiRequestJsonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Classe responsavel por realizar requests simples para APIs publicas e sem necessidade
 * de montar a URL e tem como resposta um JSON utilizando RestTemplate.
 * @author j.freitas.junior
 */
@Service
public class SimpleApiRequestJsonServiceImpl implements SimpleApiRequestJsonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleApiRequestJsonService.class);

    private final RestTemplateBuilder restTemplateBuilder;

    // Weather para a cidade do Rio de Janeiro cuja location eh 455825
    private final String URL_API_GET = "https://www.metaweather.com/api/location/455825/";

    @Autowired
    public SimpleApiRequestJsonServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public void fazerRequestSimplesUtilizandoApiWeather() {

        LOGGER.info("Realizando requisicao para: {}", URL_API_GET);

        RestTemplate restTemplate = restTemplateBuilder.build();

        Weather weather = restTemplate.getForObject(URL_API_GET, Weather.class);

        if(null != weather) {
            LOGGER.info("Resposta: ");
            LOGGER.info(weather.toString());
        }
    }

}
