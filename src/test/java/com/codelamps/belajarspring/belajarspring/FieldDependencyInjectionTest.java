package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.repository.CustomerRepository;
import com.codelamps.belajarspring.belajarspring.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldDependencyInjectionTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(MasterDependencyConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFieldDependencyInjection(){
        CustomerRepository repository = context.getBean(CustomerRepository.class);
        CustomerService service = context.getBean(CustomerService.class);

//        Assertions.assertSame(repository, service.getCustomerRepository());
    }


}
