package com.example.exam_ead.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prodid")
    private Long prodID;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "description")
    private String description;
    @Column(name = "date_of_manf")
    private LocalDate dateOfManf;
    @Column(name = "price")
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<Sale> sales;


}
