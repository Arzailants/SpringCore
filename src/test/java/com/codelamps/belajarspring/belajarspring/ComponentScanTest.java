package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Bar;
import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponenScanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponenScan(){
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
    }
}
