package com.codelamps.belajarspring.belajarspring.configuration;

import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo(){
        log.info("Membuat Objek Foo");
        return new Foo();
    }
}
