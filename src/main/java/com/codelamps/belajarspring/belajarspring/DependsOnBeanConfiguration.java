package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Bar;
import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnBeanConfiguration {

    @Lazy
    @Bean
    @DependsOn(value = {"barfirst"})
    public Foo foofirst(){
        log.info("Create Bean Foo");
        return new Foo();
    }

    @Lazy
    @Bean
    public Bar barfirst(){
        log.info("Create Bean Bar");
        return new Bar();
    }
}
