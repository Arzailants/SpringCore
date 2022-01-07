package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.ScopeData;
import org.junit.jupiter.api.Assertions;
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

//        Assertions.assertNotSame(firstBean, secondBean);
//        Assertions.assertNotSame(firstBean, thirdBean);
//        Assertions.assertNotSame(secondBean, thirdBean);

        Assertions.assertSame(firstBean, secondBean);
        Assertions.assertSame(firstBean, thirdBean);
        Assertions.assertSame(secondBean, thirdBean);

    }
}
