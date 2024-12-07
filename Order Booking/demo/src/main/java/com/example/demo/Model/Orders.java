package com.example.demo.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Data
public class Orders {
    @Id
    @Column(name = "order_id")
    Integer id;

    @Column(name = "product_name")
    private String p_name;

    @Column(name = "customer_name")
    private String c_name;

    @Column(name = "Quantity")
    Integer quantity;

    @Column(name = "orderDate")
    LocalDate date;
}
