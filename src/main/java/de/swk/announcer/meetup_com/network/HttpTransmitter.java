package de.swk.announcer.meetup_com.network;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import static javax.ws.rs.client.ClientBuilder.newClient;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN_TYPE;

/**
 * @author egga
 */
public class HttpTransmitter {

    public String get(String uri) {
        Client client = newClient();
        WebTarget webTarget = client.target(uri);
        Builder invocationBuilder = webTarget.request(TEXT_PLAIN_TYPE);

        Response response = invocationBuilder.get();
        if (response.getStatus() != 200) {
            throw new ConnectionException(response);
        }

        return response.readEntity(String.class);
    }
}
