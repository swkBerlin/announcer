package de.swk.announcer.infrastructure;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author egga
 */
@ContextConfiguration(classes = Application.class)
@WebAppConfiguration
public class ControllerTestBase {

    @Autowired
    private WebApplicationContext context;

    public MockMvc client;

    @Before
    public void setUp()  {
        client = MockMvcBuilders.webAppContextSetup(context).build();
    }

}
