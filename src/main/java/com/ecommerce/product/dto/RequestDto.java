package com.ecommerce.product.dto;

import com.ecommerce.product.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private String id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Product.Rating rating;

}
