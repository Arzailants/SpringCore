package com.codelamps.belajarspring.belajarspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.codelamps.belajarspring.belajarspring.repository",
        "com.codelamps.belajarspring.belajarspring.service"
})
public class ComponentConfiguration {
}
