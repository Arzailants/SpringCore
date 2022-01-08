package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Bar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnBeanTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnBeanConfiguration.class);
    }

    @Test
    void testDependsOnBean(){
        Bar bar = applicationContext.getBean(Bar.class);
    }
}
