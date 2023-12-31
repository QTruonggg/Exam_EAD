package com.example.exam_ead.service.impl;

import com.example.exam_ead.entity.Product;
import com.example.exam_ead.repository.ProductRepository;
import com.example.exam_ead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}