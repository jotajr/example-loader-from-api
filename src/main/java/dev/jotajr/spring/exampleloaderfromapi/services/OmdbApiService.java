package dev.jotajr.spring.exampleloaderfromapi.services;

import dev.jotajr.spring.exampleloaderfromapi.beans.omdb.OmdbBean;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 *  Interface responsavel por definir os metodos de OmdbApiService
 * @author j.freitas.junior
 * @see dev.jotajr.spring.exampleloaderfromapi.services.impl.OmdbApiServiceImpl
 */
public interface OmdbApiService {

    OmdbBean getOmdbData(String validImdbId) throws URISyntaxException, IOException;
}
