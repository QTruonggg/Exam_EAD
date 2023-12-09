package com.example.exam_ead.service;

import com.example.exam_ead.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService{
    public List<Product> getAllProducts();
}