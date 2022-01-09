package com.codelamps.belajarspring.belajarspring.configuration;

import com.codelamps.belajarspring.belajarspring.repository.CustomerRepository;
import com.codelamps.belajarspring.belajarspring.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class CustomerConfiguration {

    @Primary
    @Bean
    public CustomerRepository normalCustomer(){
        log.info("Membuat Bean Normal Customer");
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomer(){
        log.info("Membuat Bean Premium Customer");
        return new CustomerRepository();
    }
}
