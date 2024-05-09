package com.example.product.service;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.product.dto.ProductDTO;

@WebMvcTest
public class ProductEntityApplicationTest {
    @MockBean
    private ProductService productService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCallProductService() throws Exception {
        when(productService.getAllProducts()).thenReturn(List.of(new ProductDTO(1, "tets")));
        mockMvc.perform(get("/product/all")).andExpect(status().isOk())
                .andDo(print());
    }
}
