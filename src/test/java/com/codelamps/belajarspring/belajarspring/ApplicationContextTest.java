package com.codelamps.belajarspring.belajarspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Assertions.assertNotNull(context);

        Assertions.assertNotEquals(context, context1);

    }
}
