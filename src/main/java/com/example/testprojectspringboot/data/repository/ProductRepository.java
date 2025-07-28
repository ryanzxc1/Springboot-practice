package com.example.testprojectspringboot.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testprojectspringboot.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}