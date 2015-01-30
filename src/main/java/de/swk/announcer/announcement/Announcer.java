package de.swk.announcer.announcement;

import de.swk.announcer.meetup.MeetUp;

import java.util.LinkedList;
import java.util.List;

/**
 * @author egga
 */
public class Announcer {

    private List<Receiver> receivers = new LinkedList<>();

    public void announce (MeetUp meetUp) {
        for (Receiver receiver : receivers) {
            receiver.announce(meetUp);
        }

    }

    public void addReceiver (Receiver receiver) {
        this.receivers.add(receiver);
    }
}
