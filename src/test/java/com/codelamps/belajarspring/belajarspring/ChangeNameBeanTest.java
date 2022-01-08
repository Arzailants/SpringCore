package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChangeNameBeanTest {

    ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ChangeNameBeans.class);
    }
    @Test
    void testChangeNameBean(){

        Foo foo = applicationContext.getBean(Foo.class);
        Foo firstFoo = applicationContext.getBean("firstFoo", Foo.class);
        Foo secondFoo = applicationContext.getBean("secondFoo", Foo.class);

        Assertions.assertSame(foo, firstFoo);
        Assertions.assertNotSame(firstFoo, secondFoo);
    }
}
