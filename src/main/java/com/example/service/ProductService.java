package com.example.service;

import com.example.repository.ProductRepository;
import com.example.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listAll() {
        return repository.findAll();
    }

    public void save(Product product) {
        repository.save(product);
    }

    public Product get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
