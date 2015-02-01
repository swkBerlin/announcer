package de.swk.announcer.meetup_com;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.swk.announcer.infrastructure.Configuration;
import de.swk.announcer.meetup_com.events.Event;
import de.swk.announcer.meetup_com.network.HttpTransmitter;

import java.io.IOException;

/**
 * @author egga
 */
public class Client {

    // TODO DI
    private Configuration configuration = new Configuration();

    private final ObjectMapper mapper = new ObjectMapper();

    private HttpTransmitter transmitter = new HttpTransmitter();

    private final String host = "http://api.meetup.com/";

    private final String authParam = "?key=" + configuration.getMeetUpComApiKey();


    public Event fetchEvent(Integer eventId) throws IOException {
        String path = "2/event/";
        String content = transmitter.get(host + path + eventId + authParam);
        Event event = mapper.readValue(content, Event.class);
        return event;
    }
}
