package de.swk.announcer.meetup_com;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import de.swk.announcer.meetup_com.events.Event;
import de.swk.announcer.meetup_com.events.Transmitter;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class ClientSpec {

    public static final Integer EVENT_ID = 220066295;

    {
        // TODO mock requests

        describe("a client", it -> {
            Transmitter client = new Transmitter();

            it.should("be able to fetch an existing event", expect -> {
                Event event = client. fetch(EVENT_ID);
                expect.that(event.name).equals("Language Features You Are (Probably) Not Using Enough");
            });

        });
    }

}
