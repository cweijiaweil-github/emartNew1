package com.emart.subCategory.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.emart.subCategory.entity.SubCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SubCategoryDao extends JpaRepository<SubCategory, String> {

List<SubCategory> findByCategoryId(String categoryId);

}