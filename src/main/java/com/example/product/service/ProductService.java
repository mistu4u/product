package com.example.product.service;

import com.example.product.dto.ProductDTO;
import com.example.product.mapper.ProductMapper;
import com.example.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAllProducts() {
        return ProductMapper.PRODUCT_MAPPER.fromProducts(productRepository.findAll());
    }

    public void createProduct(ProductDTO productDTO) {
        productRepository.save(ProductMapper.PRODUCT_MAPPER.fromProductDTO(productDTO));
    }
}

