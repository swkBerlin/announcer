package de.swk.announcer.meetup_com;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author egga
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MeetUpComEvent {

    public String id;

    public String name;

    public String event_url;

    public String description;

    public String how_to_find_us;

}
