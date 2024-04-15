package com.example.product.service;

import java.util.List;

import com.example.product.mapper.ProductMapper;
import com.example.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import com.example.product.dto.ProductDTO;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProducts() {
        return ProductMapper.PRODUCT_MAPPER.fromProducts(productRepository.findAll());
    }
}

