package com.example.demo.Controller;


import com.example.demo.Model.Orders;
import com.example.demo.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired private OrderRepository orderRepository;

    @PostMapping
    public ResponseEntity<String> addOrder(@RequestBody Orders order){
        order.setDate(LocalDate.now());
        orderRepository.save(order);
        return ResponseEntity.ok("sucessfully added");
    }

    @GetMapping
    public ResponseEntity<List<Orders>> getOrders(){
        return  ResponseEntity.ok(orderRepository.findAll());
    }
}
