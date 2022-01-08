package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.server.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfiguration {

    @Bean(initMethod = "mulai", destroyMethod = "berhenti")
    public Server server(){
        return new Server();
    }
}
