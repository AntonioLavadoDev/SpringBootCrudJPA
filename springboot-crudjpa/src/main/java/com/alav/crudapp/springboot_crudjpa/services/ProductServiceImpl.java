package com.alav.crudapp.springboot_crudjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alav.crudapp.springboot_crudjpa.entities.Product;
import com.alav.crudapp.springboot_crudjpa.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly=true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Transactional(readOnly=true)
    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    @Transactional
    public Product update(Long id, Product product) {
        Optional<Product> productOptional = repository.findById(id);
        //este if es para verificar si el producto existe, si no existe no se puede actualizar.
        if(productOptional.isPresent()) {
            Product productDb = productOptional.orElseThrow();
            productDb.setName(product.getName());
            productDb.setPrice(product.getPrice());
            productDb.setDescription(product.getDescription());
            return Optional.of(repository.save(productDb)).orElseThrow();
        }
        return productOptional.orElseThrow();
    }
    
    

    @Transactional
    @Override
    public Optional<Product> delete(Long id) {
        Optional<Product> productOptional = repository.findById(id);
        productOptional.ifPresent(productDb -> {
            repository.delete(productDb);
        });
        //Devolvemos el optional si borró.
        return productOptional;
        
    }

    

    

}
