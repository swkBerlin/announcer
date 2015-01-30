package de.swk.announcer.announcement;

import de.swk.announcer.event.Event;

/**
 * @author egga
 */
public interface EventUpdateListener {

    void handleUpdate(Event event);

}
