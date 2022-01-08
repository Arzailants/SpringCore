package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.repository.ProdukRepository;
import com.codelamps.belajarspring.belajarspring.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent(){
        ProductService service1 = context.getBean(ProductService.class);
        ProductService service2 = context.getBean("productService", ProductService.class);

//        Assertions.assertNotNull(service);
        Assertions.assertSame(service1, service2);
    }

    void testConstructorDependencyInjection(){
        ProductService service = context.getBean(ProductService.class);
        ProdukRepository repository = context.getBean(ProdukRepository.class);

        Assertions.assertSame(repository, service.getProdukRepository());
    }
}
