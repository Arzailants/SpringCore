package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.server.PostConstructAndPreDestroyServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PostAndPreServerConfiguration {

    @Bean
    public PostConstructAndPreDestroyServer server(){
        return new PostConstructAndPreDestroyServer();
    }
}
