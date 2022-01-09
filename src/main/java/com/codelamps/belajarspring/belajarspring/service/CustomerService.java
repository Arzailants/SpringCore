package com.codelamps.belajarspring.belajarspring.service;

import com.codelamps.belajarspring.belajarspring.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    private CustomerRepository customerRepository;
}
