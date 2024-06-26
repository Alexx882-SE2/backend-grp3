package se.group3.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.group3.backend.configuration.WebsocketConfiguration;

@SpringBootTest
class WebsocketConfigurationTests {

    @Autowired
    private WebsocketConfiguration websocketConfiguration;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(websocketConfiguration);
    }
}
