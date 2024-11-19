package com.example.product.mapper;

import com.example.product.dto.ProductDTO;
import com.example.product.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO fromProduct(ProductEntity product);
    List<ProductDTO> fromProducts(List<ProductEntity> product);
    ProductEntity fromProductDTO(ProductDTO productDTO);
}
