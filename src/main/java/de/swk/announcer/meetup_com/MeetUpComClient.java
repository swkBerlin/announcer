package de.swk.announcer.meetup_com;

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

    public String fetchEvent() {
        Client client = ClientBuilder.newClient();
        int eventId = 220066295;
        String path = "2/event/";
        String host = "http://api.meetup.com/";
        String key = "secret";
        String param = "?key=" + key;
        WebTarget webTarget = client.target(host + path + eventId+param);
        Invocation.Builder invocationBuilder =
                webTarget.request(MediaType.TEXT_PLAIN_TYPE);
        Response response = invocationBuilder.get();
        System.out.println(response.getStatus());
        System.out.println(response.readEntity(String.class));
        return null;
    }
}
