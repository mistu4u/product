package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.dto.ProductDTO;

@Service
public class ProductService {

    public List<ProductDTO> getAllProducts() {
        return List.of(new ProductDTO(1,"Sony TV"),new ProductDTO(1,"Samsung TV"));
    }
}

