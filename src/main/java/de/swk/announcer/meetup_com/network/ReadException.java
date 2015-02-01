package de.swk.announcer.meetup_com.network;

/**
 * @author egga
 */
public class ReadException extends RuntimeException {

    private Throwable cause;

    public ReadException(Throwable e) {
        cause = e;
    }
}
