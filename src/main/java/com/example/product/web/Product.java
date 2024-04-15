package com.example.product.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.ProductDTO;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class Product {
    private ProductService productService;
    
    public Product(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> getProducts(){
        return productService.getAllProducts();
    }
}
