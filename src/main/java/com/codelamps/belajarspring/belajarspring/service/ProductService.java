package com.codelamps.belajarspring.belajarspring.service;

import com.codelamps.belajarspring.belajarspring.repository.ProdukRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProdukRepository produkRepository;

    public ProductService(ProdukRepository produkRepository){
        this.produkRepository = produkRepository;
    }
}
