package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.server.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ServerConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testServer(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ServerConfiguration.class);

        Server server = context.getBean(Server.class);
    }
}
