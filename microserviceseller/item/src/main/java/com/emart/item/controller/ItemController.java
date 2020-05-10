package com.emart.item.controller;

import com.emart.category.entity.Category;
import com.emart.category.service.CategoryService;
import com.emart.item.entity.Item;
import com.emart.item.service.ItemService;
import com.emart.subCategory.entity.SubCategory;
import com.emart.subCategory.service.SubCategoryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping(value = "item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    SubCategoryService subCategoryService;
    
    @Autowired
    CategoryService categoryService;

    @PostMapping(value = "/save")
    public Item queryItemById(@RequestBody Item item) {
         return this.itemService.saveCategory(item);
    }
    
    @GetMapping(value = "/findcategorys")
    public Map<String,List<Category>> findAllCategory() {
        List<Category> categoryList = this.categoryService.findAllCategory();
        Map<String,List<Category>> map = new HashMap<>();
        if  (categoryList.size() > 0){
            map.put("key", categoryList);
        }
        return map;
    }
    @PostMapping(value = "/findsubcategorys")
    public Map<String,List<SubCategory>> findAllCategory(String category_id) {
        List<SubCategory> subCategoryList = this.subCategoryService.findByCategory_id(category_id);
        Map<String,List<SubCategory>> map = new HashMap<>();
        if  (subCategoryList.size() > 0){
            map.put("key", subCategoryList);
        }
        return map;
    }
}