package com.educandoweb.course.services;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return this.repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = this.repository.findById(id);
        return product.get();
    }
}
