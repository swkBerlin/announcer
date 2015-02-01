package de.swk.announcer.meetup_com;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.swk.announcer.infrastructure.Configuration;
import de.swk.announcer.meetup_com.network.HttpTransmitter;

import java.io.IOException;

/**
 * @author egga
 */
public abstract class Client<T> {

    // TODO DI
    private Configuration configuration = new Configuration();

    private final ObjectMapper mapper = new ObjectMapper();

    private HttpTransmitter transmitter = new HttpTransmitter();

    private final String host = "http://api.meetup.com/";

    private final String authParam = "?key=" + configuration.getMeetUpComApiKey();


    // contract
    protected abstract String getEndpoint();

    protected abstract Class<T> getEntityClass();


    // methods
    public T getById(Integer eventId) throws IOException {
        String url = host + getEndpoint() + eventId + authParam;
        String content = transmitter.get(url);
        T entity = mapper.readValue(content, getEntityClass());
        return entity;
    }
}
