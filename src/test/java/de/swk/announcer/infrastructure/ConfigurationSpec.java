package de.swk.announcer.infrastructure;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;


@RunWith(JunitSuiteRunner.class)
public class ConfigurationSpec {
    {

        describe("a configuration", it -> {
            Configuration reader = new Configuration();

            it.should("contain the api key for meetup.com", expect -> {
                String key = reader.getMeetUpComApiKey();
                expect.that(key).isNotNull();
            });

        });
    }
}
