package com.example.exam_ead.controller;

import com.example.exam_ead.entity.Sale;
import com.example.exam_ead.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;
    @GetMapping("/getAll")
    public String getAll(ModelMap modelMap) {
        String view = "sale/list";
        try {
            List<Sale> sales = saleService.getAllSales();
            modelMap.addAttribute("sales", sales);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }
}
