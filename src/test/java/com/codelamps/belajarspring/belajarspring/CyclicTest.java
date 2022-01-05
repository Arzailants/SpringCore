package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.cyclic.CyclicA;
import com.codelamps.belajarspring.belajarspring.data.cyclic.CyclicB;
import com.codelamps.belajarspring.belajarspring.data.cyclic.CyclicC;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCyclic(){

        Assertions.assertThrows(Throwable.class, () ->{
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });

        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);

            Assertions.fail("It must be fail because cyclic");
        } catch (BeansException e){
            e.printStackTrace();
        }

    }
}
