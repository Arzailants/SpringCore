package com.codelamps.belajarspring.belajarspring.service;

import com.codelamps.belajarspring.belajarspring.repository.SetterRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SetterService {

    @Getter
    private SetterRepository setterRepository;

    @Autowired
    public void setSetterRepository(SetterRepository setterRepository){
        this.setterRepository = setterRepository;
    }
}
