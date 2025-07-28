package com.example.testprojectspringboot.data.dto;



import lombok.*;
import com.example.testprojectspringboot.data.entity.ProductEntity ;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}

