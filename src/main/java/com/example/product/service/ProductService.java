package com.example.product.service;

import com.example.product.dto.ProductDTO;
import com.example.product.mapper.ProductMapper;
import com.example.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDTO> getAllProducts() {
        return productMapper.fromProducts(productRepository.findAll());
    }

    public void createProduct(ProductDTO productDTO) {
        productRepository.save(productMapper.fromProductDTO(productDTO));
    }
}

