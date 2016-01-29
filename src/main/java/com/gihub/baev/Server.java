package com.gihub.baev;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 29.01.16
 */
public class Server extends ResourceConfig {

    public Server() {
        register(JacksonFeature.class);
        register(JacksonObjectMapperProvider.class);
    }
}
