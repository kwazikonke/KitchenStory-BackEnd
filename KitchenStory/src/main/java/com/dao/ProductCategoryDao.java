package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ProductCategory;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Long >{

}
