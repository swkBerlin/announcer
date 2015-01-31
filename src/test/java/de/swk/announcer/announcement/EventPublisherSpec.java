package de.swk.announcer.announcement;

import com.insightfullogic.lambdabehave.Description;
import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import de.swk.announcer.event.Event;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static org.mockito.Mockito.verify;

/**
 * @author egga
 */
@RunWith(JunitSuiteRunner.class)
public class EventPublisherSpec {
    {

        describe("an event publisher with two listeners", it -> {
            EventPublisher publisher = new EventPublisher();

            EventUpdateListener listener = addMockListener(it, publisher);
            EventUpdateListener anotherListener = addMockListener(it, publisher);

            it.should("pass an update to all listeners", expect -> {

                Event event = new Event();
                publisher.publishUpdate(event);

                verifyThatAllListenersReceived(event,
                        listener,
                        anotherListener
                );
            });

        });
    }

    private EventUpdateListener addMockListener(Description it, EventPublisher publisher) {
        EventUpdateListener listener = it.usesMock(EventUpdateListener.class);
        publisher.subscribe(listener);
        return listener;
    }

    private void verifyThatAllListenersReceived(Event event, EventUpdateListener... listeners) {
        for (EventUpdateListener listener : listeners) {
            verify(listener).handleUpdate(event);
        }

    }
}
