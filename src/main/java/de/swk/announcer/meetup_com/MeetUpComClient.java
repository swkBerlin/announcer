package de.swk.announcer.meetup_com;

import de.swk.announcer.infrastructure.Configuration;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author egga
 */
public class MeetUpComClient {

    Configuration configuration = new Configuration();

    public String fetchEvent() {
        Client client = ClientBuilder.newClient();
        int eventId = 220066295;
        String path = "2/event/";
        String host = "http://api.meetup.com/";
        String authParam = "?key=" + configuration.getMeetUpComApiKey();

        WebTarget webTarget = client.target(host + path + eventId+authParam);
        Invocation.Builder invocationBuilder =
                webTarget.request(MediaType.TEXT_PLAIN_TYPE);
        Response response = invocationBuilder.get();
        System.out.println(response.getStatus());
        String body = response.readEntity(String.class);
        System.out.println(body);

        return body;
    }
}
