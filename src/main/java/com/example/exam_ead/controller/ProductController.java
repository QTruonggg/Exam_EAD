package com.example.exam_ead.controller;

import com.example.exam_ead.entity.Product;
import com.example.exam_ead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public String getAll(ModelMap modelMap) {
        String view = "product/list";
        try {
            List<Product> products = productService.getAllProducts();
            modelMap.addAttribute("products", products);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }
}
