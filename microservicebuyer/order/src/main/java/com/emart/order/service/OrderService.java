package com.emart.order.service;

import com.emart.order.entity.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ItemService itemService;

    public Item queryItemById(Long orderId) {
        Item item = this.itemService.queryItemById(orderId);

        return item;
    }

}
