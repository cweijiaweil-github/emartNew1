package com.emart.item.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.emart.item.dao.ItemDao;
import com.emart.item.entity.Item;
import com.emart.item.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemDao itemDao;

    @Override
    public Item saveCategory(Item item) {
        try {
            return this.itemDao.save(item);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

}