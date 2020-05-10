package com.emart.item.service;

import com.emart.item.entity.Item;

import org.springframework.stereotype.Service;

@Service
public interface ItemService {
	
    public Item saveCategory(Item item);

}