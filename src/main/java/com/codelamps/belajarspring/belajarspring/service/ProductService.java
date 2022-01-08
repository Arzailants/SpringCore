package com.codelamps.belajarspring.belajarspring.service;

import com.codelamps.belajarspring.belajarspring.repository.ProdukRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProdukRepository produkRepository;

    @Autowired
    public ProductService(ProdukRepository produkRepository){
        this.produkRepository = produkRepository;
    }

    public ProductService(ProdukRepository produkRepository, String name){
        this.produkRepository = produkRepository;
    }
}
