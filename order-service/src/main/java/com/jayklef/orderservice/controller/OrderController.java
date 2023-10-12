package com.jayklef.orderservice.controller;

import com.jayklef.orderservice.dto.OrderDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderDetails orderDetails){
        return "Order placed successfully";
    }
}
