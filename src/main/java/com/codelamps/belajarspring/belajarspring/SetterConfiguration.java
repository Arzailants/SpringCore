package com.codelamps.belajarspring.belajarspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.codelamps.belajarspring.belajarspring.repository",
        "com.codelamps.belajarspring.belajarspring.service"
})
public class SetterConfiguration {
}
