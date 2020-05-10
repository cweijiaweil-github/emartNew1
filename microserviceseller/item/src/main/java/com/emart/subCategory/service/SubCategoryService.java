package com.emart.subCategory.service;

import java.util.List;

import com.emart.category.entity.Category;
import com.emart.subCategory.entity.SubCategory;

import org.springframework.stereotype.Service;

@Service
public interface SubCategoryService {
        
    public SubCategory saveSubCategory(SubCategory subCategory);

    public List<SubCategory> findByCategory_id(String category_id);
    
}