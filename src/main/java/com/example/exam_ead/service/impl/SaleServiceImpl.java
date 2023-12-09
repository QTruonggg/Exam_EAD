package com.example.exam_ead.service.impl;

import com.example.exam_ead.entity.Sale;
import com.example.exam_ead.repository.SaleRepository;
import com.example.exam_ead.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }
}
