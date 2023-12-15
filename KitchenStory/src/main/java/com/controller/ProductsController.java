package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductsDao;
import com.entity.Products;
import com.util.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ProductsController {

	@Autowired
	private ProductsDao productsDao;
	
	//Getting all products
	@GetMapping("/products")
	public List<Products> getAllProducts(){
		return productsDao.findAll();
	}
	
	// Creating products rest api
	@PostMapping("/employees/{id}")
	public ResponseEntity<Products> getProductsById(@PathVariable Long id){
		Products product = productsDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Products not exit with id:"+id));
		return ResponseEntity.ok(product);
	}
	
	//Updating products
	@PutMapping("/products/{id}")
	public ResponseEntity<Products> updateProducts(@PathVariable Long id, @RequestBody Products productDetails){
		Products product = productsDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Products not exit with id:"+id));
		
		product.setProductName(productDetails.getProductName());
		product.setProductDescription(productDetails.getProductDescription());
		product.setProductPrice(productDetails.getProductPrice());
		
		Products updateProducts = productsDao.save(product);
		return ResponseEntity.ok(updateProducts);
	}
	// Deleting products
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteProduct(@PathVariable Long id){
		Products product = productsDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("Products not exit with id:"+id));
		
		productsDao.delete(product);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
