package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.configuration.CustomerConfiguration;
import com.codelamps.belajarspring.belajarspring.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMultipleBeanTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);
    }

    @Test
    void testCustomerTest(){
        CustomerRepository repository = context.getBean(CustomerRepository.class);

        Assertions.assertNotNull(repository);
    }
}
