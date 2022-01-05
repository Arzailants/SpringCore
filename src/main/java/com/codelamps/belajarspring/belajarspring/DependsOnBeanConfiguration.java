package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.Bar;
import com.codelamps.belajarspring.belajarspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnBeanConfiguration {

    @Bean
    @DependsOn(value = {"barfirst"})
    public Foo foofirst(){
        log.info("Create Bean Foo");
        return new Foo();
    }

    @Bean
    public Bar barfirst(){
        log.info("Create Bean Bar");
        return new Bar();
    }
}
