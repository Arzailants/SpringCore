package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.server.PostConstructAndPreDestroyServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostAndPreServerTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(PostAndPreServerConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testServer(){
        applicationContext.getBean(PostConstructAndPreDestroyServer.class);
    }
}
