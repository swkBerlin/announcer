package de.swk.announcer.meetup_com.events;

import de.swk.announcer.meetup_com.Client;

import java.io.IOException;

/**
 * @author egga
 */
public class Transmitter extends Client<Event> {

    private static final String ENDPOINT = "2/event/";

    public Event fetch(Integer eventId) throws IOException {
        String path = ENDPOINT;
        String content = getTransmitter().get(getHost() + path + eventId + getAuthParam());
        Event event = getMapper().readValue(content, Event.class);
        return event;
    }
}
