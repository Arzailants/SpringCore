package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.Foo;
import com.codelamps.belajarspring.belajarspring.scope.Doubleton;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class DoubletonConfiguration {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new Doubleton());
        return configurer;
    }


    @Bean
    @Scope("doubleton")
    public Foo foo(){
        log.info("Create New Object Foo");
        return new Foo();
    }
}
