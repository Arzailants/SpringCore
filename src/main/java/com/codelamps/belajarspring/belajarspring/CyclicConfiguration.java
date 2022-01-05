package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.cyclic.CyclicA;
import com.codelamps.belajarspring.belajarspring.data.cyclic.CyclicB;
import com.codelamps.belajarspring.belajarspring.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
