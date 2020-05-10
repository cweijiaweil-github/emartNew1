package com.emart.item.dao;

import com.emart.item.entity.Item;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ItemDao   extends JpaRepository<Item, Integer>, CrudRepository<Item, Integer>{


}