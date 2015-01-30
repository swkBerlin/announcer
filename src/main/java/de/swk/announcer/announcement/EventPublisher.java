package de.swk.announcer.announcement;

import de.swk.announcer.event.Event;

import java.util.LinkedList;
import java.util.List;

/**
 * @author egga
 */
public class EventPublisher {

    private List<EventUpdateListener> updateListeners = new LinkedList<>();

    public void publishUpdate(Event event) {
        updateListeners.forEach(l -> l.handleUpdate(event));
    }

    public void subscribe(EventUpdateListener listener) {
        this.updateListeners.add(listener);
    }
}
