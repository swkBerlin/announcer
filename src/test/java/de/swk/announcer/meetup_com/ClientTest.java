package de.swk.announcer.meetup_com;

import de.swk.announcer.meetup_com.network.ConnectionException;
import de.swk.announcer.meetup_com.network.HttpTransmitter;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ClientTest {

    private HttpTransmitter transmitter;

    @Before
    public void setUp() throws Exception {
        transmitter = new HttpTransmitter();
    }

    @Test
    public void it_should_get_an_existing_resource() {
        String content = transmitter.get("http://httpstat.us/200");
        assertThat(content).contains("OK");
    }

    @Test(expected = ConnectionException.class)
    public void it_throw_a_connection_error_on_imaginary_resource() {
        transmitter.get("http://rainbowpoopingunicorns.com");
    }

    @Test(expected = ConnectionException.class)
    public void it_throw_a_connection_error_on_bad_resource() {
        transmitter.get("http://httpstat.us/400");
    }
}