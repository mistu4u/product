package com.example.product.mapper;

import com.example.product.dto.ProductDTO;
import com.example.product.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);
    ProductDTO fromProduct(Product product);
    List<ProductDTO> fromProducts(List<Product> product);
}
