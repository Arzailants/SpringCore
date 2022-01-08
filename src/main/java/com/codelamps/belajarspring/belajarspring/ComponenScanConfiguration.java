package com.codelamps.belajarspring.belajarspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = {
        "com.codelamps.belajarspring.belajarspring.configuration"
})
public class ComponenScanConfiguration {
}
