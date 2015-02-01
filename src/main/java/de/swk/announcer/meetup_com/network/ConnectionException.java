package de.swk.announcer.meetup_com.network;

import javax.ws.rs.core.Response;

/**
 * @author egga
 */
public class ConnectionException extends RuntimeException {

    private final Response response;

    public ConnectionException(Response response) {
        this.response = response;
    }
}
