package de.swk.announcer.announcement;

import de.swk.announcer.meetup.MeetUp;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * @author egga
 */
public class AnnouncerTest {

    @Test
    public void itShouldNotifyAllReceivers() {
        Announcer announcer = new Announcer();
        Receiver receiver = mock(Receiver.class);
        MeetUp meetUp = new MeetUp();

        announcer.addReceiver(receiver);
        announcer.announce(meetUp);
        verify(receiver).announce(meetUp);

    }

}
