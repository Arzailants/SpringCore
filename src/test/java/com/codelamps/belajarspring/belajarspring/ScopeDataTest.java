package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.ScopeData;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeDataTest {

    @Test
    void testScopeData(){

        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);

        ScopeData firstBean = context.getBean(ScopeData.class);
        ScopeData secondBean = context.getBean(ScopeData.class);
        ScopeData thirdBean = context.getBean(ScopeData.class);

    }
}
