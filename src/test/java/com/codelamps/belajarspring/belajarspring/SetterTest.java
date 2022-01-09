package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.repository.SetterRepository;
import com.codelamps.belajarspring.belajarspring.service.SetterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(SetterConfiguration.class);
    }

    @Test
    void testSetterDependencyInjection(){

        SetterRepository repository = context.getBean(SetterRepository.class);
        SetterService service = context.getBean(SetterService.class);

        Assertions.assertNotNull(repository);
        Assertions.assertNotNull(service);
        Assertions.assertSame(repository, service.getSetterRepository());

    }
}
