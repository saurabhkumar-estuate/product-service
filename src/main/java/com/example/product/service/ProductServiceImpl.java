package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.exception.ProductNotFoundException;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ProductNotFoundException("Product not found with id: " + id));
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
	
	

}
