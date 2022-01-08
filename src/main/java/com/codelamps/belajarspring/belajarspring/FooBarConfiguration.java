package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.configuration.BarConfiguration;
import com.codelamps.belajarspring.belajarspring.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class FooBarConfiguration {


}
