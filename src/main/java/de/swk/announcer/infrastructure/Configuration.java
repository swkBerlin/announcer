package de.swk.announcer.infrastructure;

import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * @author egga
 */
@Service
public class Configuration {

    public static final String MEETUP_COM_API_KEY = "MEETUP_COM_API_KEY";

    final Properties values = new Properties();

    public Configuration() {
        init();
    }

    public String getMeetUpComApiKey() {
        return values.getProperty(MEETUP_COM_API_KEY);
    }

    private void init() {
        String getenv = System.getenv(MEETUP_COM_API_KEY);
        values.put(MEETUP_COM_API_KEY, getenv);
    }
}
