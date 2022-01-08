package com.codelamps.belajarspring.belajarspring.configuration;

import com.codelamps.belajarspring.belajarspring.data.foobar.Bar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar(){
        log.info("Membuat Objek Bar");
        return new Bar();
    }
}
