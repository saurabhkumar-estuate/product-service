package com.example.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return service.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

}
