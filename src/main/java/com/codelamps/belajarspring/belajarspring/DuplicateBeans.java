package com.codelamps.belajarspring.belajarspring;

import com.codelamps.belajarspring.belajarspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class DuplicateBeans {

    // UNTUK MEMBUAT BEAN, KITA HARUS MEMBUAT METHOD DI KELAS CONFIGURATION
    // UNTUK MEMBUAT METHOD ITU MENJADI BEAN, KITA HARUS MENAMBAHKAN ANNOTATION BEAN DI METHOD
    // UNTUK MEMBUAT DUPLICAT BEAN KITA MENGGUNAKAN TIPE DATA KEMBALIAN YANG SAMA
    // AKAN TETAPI MENGGUNAKAN NAMA METHOD YANG BERBEDA, DAN UNTUK MEMANGGILNYA, TINGGAL KITA SEBUT NAMA METHOD
    @Primary
    @Bean
    public Foo foo1(){
        log.info("Create Foo 1");
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        log.info("Create Foo 2");
        return new Foo();
    }

}
