package de.swk.announcer.meetup_com;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class MeetUpComClientSpec {
    {

        describe("a client", it -> {

            MeetUpComClient client = new MeetUpComClient();

            it.should("get an event", expect -> {


                String event = client.fetchEvent();

            });

        });
    }
}
