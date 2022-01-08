package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.foobar.Foo;
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
    
    
    @Test
    void testDuplicateBeanPrimaryBean(){
        
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeans.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
