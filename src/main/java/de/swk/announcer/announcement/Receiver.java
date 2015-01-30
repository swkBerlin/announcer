package de.swk.announcer.announcement;

import de.swk.announcer.meetup.MeetUp;

/**
 * @author egga
 */
public interface Receiver {

    void announce(MeetUp meetUp);

}
