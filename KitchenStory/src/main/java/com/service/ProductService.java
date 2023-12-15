package com.service;

import java.util.List;

import com.entity.ProductCategory;
import com.entity.Products;

public interface ProductService {
	
public Products getProductById(Long productCode);
	
	public Products getProductByProductCategory(ProductCategory productCategory);
	
	public void updateProduct(Products product);
	
	public Products saveProduct(Products product);
	public void deleteProduct(Long productCode);
	
	
	public List<Products> getAllProducts();
}
