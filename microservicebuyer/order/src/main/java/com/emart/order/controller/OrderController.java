package com.emart.order.controller;

import com.emart.order.entity.Item;
import com.emart.order.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
// @Slf4j
public class OrderController {

    
    @Autowired
    private OrderService orderService;


    @GetMapping(value = "order/{orderId}")
    public Item queryItemById(@PathVariable("orderId") Long orderId) {
        
        return this.orderService.queryItemById(orderId);
    }

}