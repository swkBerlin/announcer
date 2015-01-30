package de.swk.announcer.announcement;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import de.swk.announcer.event.Event;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author egga
 */
@RunWith(JunitSuiteRunner.class)
public class EventPublisherSpec {
    {

        describe("an event publisher with two listeners", it -> {

            EventPublisher publisher = new EventPublisher();

            EventUpdateListener listener = it.usesMock(EventUpdateListener.class);
            publisher.subscribe(listener);

            EventUpdateListener anotherListener = it.usesMock(EventUpdateListener.class);
            publisher.subscribe(anotherListener);

            it.should("pass an update to all listeners", expect -> {

                Event event = new Event();
                publisher.publishUpdate(event);

                verify(listener).handleUpdate(event);
                verify(anotherListener).handleUpdate(event);
            });

        });
    }
}
