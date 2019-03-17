package dev.jotajr.spring.exampleloaderfromapi.services.impl;

import com.google.gson.Gson;
import dev.jotajr.spring.exampleloaderfromapi.beans.omdb.OmdbBean;
import dev.jotajr.spring.exampleloaderfromapi.services.OmdbApiService;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Classe responsavel por realizar requests simples com API Key para a OMDb API
 * Troque o valor da propriedade OMDB_API_KEY pela sua propria, para mais informações
 * Acesse: http://www.omdbapi.com/
 * @author j.freitas.junior
 */
@Service
public class OmdbApiServiceImpl implements OmdbApiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OmdbApiService.class);

    private final String OMDB_API_KEY = "816c725b";

    private final String BASE_URL = "http://www.omdbapi.com/";

    @Autowired
    Gson gson;

    public OmdbBean getOmdbData(String validImdbId) throws URISyntaxException, IOException {

        LOGGER.info("Iniciando o request para busca de filme na OMDb API");

        OmdbBean omdbBean;

        URIBuilder builder = new URIBuilder(BASE_URL);
        builder.setParameter("i", validImdbId);
        builder.setParameter("apikey", OMDB_API_KEY);

        LOGGER.info("URL montada: {}", builder.toString());

        HttpClient client = HttpClientBuilder.create().build();

        HttpUriRequest request = RequestBuilder.get()
                .setUri(builder.build())
                .build();

        HttpResponse response = client.execute(request);

        if(response.getStatusLine().getStatusCode() == 200) {
            LOGGER.info("GET Request was sucessfully");
            LOGGER.info("Parser da Response");
            String jsonResposta = EntityUtils.toString(response.getEntity());
            LOGGER.debug("JSON Resposta:");
            LOGGER.debug(jsonResposta);
            omdbBean = gson.fromJson(jsonResposta, OmdbBean.class);
            return omdbBean;
        } else {
            LOGGER.error("Falha na requisição, verifique o log");
            return null;
        }

    }

}
