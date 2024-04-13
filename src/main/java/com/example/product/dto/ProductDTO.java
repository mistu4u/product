package com.example.product.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductDTO(int id, @JsonProperty("product_name") String name) {
}