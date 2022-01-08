package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DoubletonTest {

    @Test
    void testDoubleton(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DoubletonConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);
        Foo foo4 = context.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo3, foo4);
        Assertions.assertSame(foo1, foo3);
        Assertions.assertSame(foo2, foo4);
    }
}
