package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Products;

@Repository
public interface ProductsDao extends JpaRepository<Products, Long>{

}
