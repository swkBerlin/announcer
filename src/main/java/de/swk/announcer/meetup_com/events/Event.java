package de.swk.announcer.meetup_com.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author egga
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

    public String id;

    public String name;

    public String event_url;

    public String description;

    public String how_to_find_us;

}
