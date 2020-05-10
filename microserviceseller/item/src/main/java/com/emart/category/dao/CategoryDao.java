package com.emart.category.dao;

import org.springframework.stereotype.Repository;

import com.emart.category.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CategoryDao  extends JpaRepository<Category, Integer>, CrudRepository<Category, Integer>{
    
    
}