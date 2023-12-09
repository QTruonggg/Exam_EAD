package com.example.exam_ead.service;

import com.example.exam_ead.entity.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    public List<Sale> getAllSales();
}
