package com.emart.order.service;

import com.emart.order.entity.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ItemService {

    
    @Autowired
    private RestTemplate restTemplate;

    // @Value("${myspcloud.item.url}")
    // private String itemUrl;
    
    public Item queryItemById(Long id) {
        System.out.println("#####################"+id+"#####################");
        String itemUrl = "http://APP-SELLER/item/{id}";
        return this.restTemplate.getForObject(itemUrl
                , Item.class,id);
    }

}