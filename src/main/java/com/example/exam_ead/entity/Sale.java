package com.example.exam_ead.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "Sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sl_no")
    private Long slNo;
    @Column(name = "salesmanid")
    private Long salesmanID;

    @ManyToOne
    @JoinColumn(name = "prodid")
    @JsonIgnore
    private Product product;
    @Column(name = "salesman_name")
    private String salesmanName;
    @Column(name = "dos")
    private LocalDate dos;




}