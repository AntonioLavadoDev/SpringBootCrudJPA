package com.alav.crudapp.springboot_crudjpa.services;

import java.util.List;
import java.util.Optional;

import com.alav.crudapp.springboot_crudjpa.entities.Product;

public interface ProductService {
    
    List<Product> findAll();

    Optional<Product>findById(Long id);

    Product save(Product product);

    Optional<Product> delete(Product product);
}
