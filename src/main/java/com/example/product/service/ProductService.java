package com.example.product.service;

import java.util.List;

import com.example.product.model.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	
	Product getProductById(Long id);

    List<Product> getAllProducts();

}
