package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.Bar;
import com.codelamps.belajarspring.belajarspring.data.Foo;
import com.codelamps.belajarspring.belajarspring.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}