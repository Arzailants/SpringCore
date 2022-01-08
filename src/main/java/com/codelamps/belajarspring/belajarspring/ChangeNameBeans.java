package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ChangeNameBeans {

    @Primary
    @Bean(value = "firstFoo")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "secondFoo")
    public Foo foo2(){
        return new Foo();
    }
}
