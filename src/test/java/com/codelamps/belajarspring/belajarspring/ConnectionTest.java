package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.lifecycle.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConnectionTest {

//    private ApplicationContext context;

    // KETIKA KITA TIDAK CLOSE APPLICATIONCONTEXT, MAKA KITA CLOSE SECARA PAKSA
    // KETIKA KITA INGIN CLOSE APPLICATIONCONTEXT SECARA MANUAL, KITA MENGGUNAKAN METHOD close()
    // AKAN TETAPI METHOD CLOSE TIDAK ADA DI APPLICATIONCONTEXT, ADA DI CONFIGURABLE APPLICATION CONTEXT
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        // REGISTER SHUT DOWN HOOK, ADALAH METHOD UNTUK CLOSE SECARA OTOMATIS
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // CLOSE ADALAH METHOD MANUAL
//        context.close();
    }

    @Test
    void testConnection(){
        Connection connection = context.getBean(Connection.class);
    }
}
