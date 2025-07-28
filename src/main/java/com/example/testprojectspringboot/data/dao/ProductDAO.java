package com.example.testprojectspringboot.data.dao;
import com.example.testprojectspringboot.data.entity.ProductEntity;


public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity product);

    ProductEntity getProduct(String productId);
}
