package de.swk.announcer.meetup_com;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.swk.announcer.infrastructure.Configuration;
import de.swk.announcer.meetup_com.network.HttpTransmitter;

/**
 * @author egga
 */
public class Client<T> {

    // TODO DI
    private Configuration configuration = new Configuration();

    private final ObjectMapper mapper = new ObjectMapper();

    private HttpTransmitter transmitter = new HttpTransmitter();

    private final String host = "http://api.meetup.com/";

    private final String authParam = "?key=" + configuration.getMeetUpComApiKey();


    protected ObjectMapper getMapper() {
        return mapper;
    }

    protected HttpTransmitter getTransmitter() {
        return transmitter;
    }

    protected String getHost() {
        return host;
    }

    protected  String getAuthParam() {
        return authParam;
    }
}
