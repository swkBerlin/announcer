package de.swk.announcer.meetup_com;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class MeetUpComClientSpec {
    {

        describe("a client", it -> {
            MeetUpComClient client = new MeetUpComClient();

            it.should("be able to fetch an existing event", expect -> {
                MeetUpComEvent event = client.fetchEvent();
                expect.that(event.name).equals("Language Features You Are (Probably) Not Using Enough");
            });

        });
    }
}
