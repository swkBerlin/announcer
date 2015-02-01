package de.swk.announcer.meetup_com.events;

import de.swk.announcer.meetup_com.Client;

/**
 * @author egga
 */
public class Transmitter extends Client<Event> {

    private final String endpoint = "2/event/";

    protected String getEndpoint() {
        return endpoint;
    }

    protected Class getEntityClass () {
        return Event.class;
    }
}
