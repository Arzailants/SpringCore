package com.codelamps.belajarspring.belajarspring.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SetterRepository {

    void loggingReport(){
        log.info("Membuat Bean SetterRepository");
    }
}
