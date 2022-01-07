package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.ScopeData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Scope("singleton")
    @Bean
    public ScopeData scopeBean(){
        log.info("Membuat Objek Bean");
        return new ScopeData();
    }

}
