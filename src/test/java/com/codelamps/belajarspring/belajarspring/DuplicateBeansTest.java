package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeansTest {

    //
    @Test
    void testDuplicateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeans.class);

        // UNTUK MEMANGGIL BEAN YANG DUPLIKAT, BISA DENGAN MEMANGGIL NAMA METHOD, DIIKUTI TIPE DATA KEMBALIAN METHOD
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
