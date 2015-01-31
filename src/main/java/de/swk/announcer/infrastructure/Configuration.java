package de.swk.announcer.infrastructure;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author egga
 */
public class Configuration {

    public static final String CONFIG_LOCATION = "/home/egga/announcer.config";
    public static final String MEETUP_COM_API_KEY = "meetup_key";

    final Properties values = new Properties();

    public Configuration() {
        readConfiguration();
    }

    public String getMeetUpComApiKey() {
        return values.getProperty(MEETUP_COM_API_KEY);
    }

    private void readConfiguration() {
        try {
            readConfigurationFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Properties readConfigurationFromFile() throws IOException {
        FileInputStream file = new FileInputStream(CONFIG_LOCATION);
        values.load(file);
        file.close();
        return values;
    }
}
