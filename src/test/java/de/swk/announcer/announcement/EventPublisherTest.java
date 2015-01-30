package de.swk.announcer.announcement;

import de.swk.announcer.event.Event;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author egga
 */
public class EventPublisherTest {

    private EventPublisher eventPublisher;
    private Event event;

    @Before
    public void setUp() throws Exception {
        eventPublisher = new EventPublisher();
        event = new Event();
    }

    @Test
    public void itShouldNotifyAllReceivers() {
        EventUpdateListener listenerA = listener();
        EventUpdateListener listenerB = listener();

        eventPublisher.subscribe(listenerA);
        eventPublisher.subscribe(listenerB);
        eventPublisher.publishUpdate(event);

        verify(listenerA).handleUpdate(event);
        verify(listenerB).handleUpdate(event);
    }

    private EventUpdateListener listener() {
        return mock(EventUpdateListener.class);
    }
}
