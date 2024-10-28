package com.alav.crudapp.springboot_crudjpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alav.crudapp.springboot_crudjpa.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
