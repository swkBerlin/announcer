package de.swk.announcer.meetup_com.network;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class HttpTransmitterSpec {

    {

        describe("a transmitter", it -> {
            HttpTransmitter transmitter = new HttpTransmitter();

            it.should("GET an existing resource", expect -> {
                String content = transmitter.get("http://google.com");
                expect.that(content).containsString("Feeling Lucky");
            });

            it.should("throw a connection error on imaginary resource", expect -> {
                expect.exception(ConnectionException.class, () ->
                                transmitter.get("http://rainbowpoopingunicorns.com")
                );
            });

        });
    }
}