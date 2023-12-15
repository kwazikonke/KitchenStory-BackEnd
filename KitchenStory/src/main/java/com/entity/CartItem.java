package com.entity;

import java.math.BigDecimal;

public class CartItem {


	private Long productId;
	private String name;
	private BigDecimal rate; //per item
	private int quantity;
	private BigDecimal price; //total 
	private String image_Url;
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartItem(Long productId, String name, BigDecimal rate, int quantity, BigDecimal price, String image_Url) {
		super();
		this.productId = productId;
		this.name = name;
		this.rate = rate;
		this.quantity = quantity;
		this.price = price;
		this.image_Url = image_Url;
	}
	
	public Long getProductId() {return this.productId; }  
	public String getName() { return this.name;} 
	public BigDecimal getPrice() { return this.price;} 
	public BigDecimal getRate() { return this.rate;} 
	public int getQuantity() { return this.quantity;} 
	
	
	public void setProductId(Long id) { this.productId= id;}
	public void setName(String value) { this.name = value;}
	public void setPrice(BigDecimal value) { this.price = value;}
	public void setRate(BigDecimal value) { this.rate = value;}
	public void setQuantity(int value) { this.quantity = value;}
	
	public String getImage_Url() {
		return image_Url;
	}
	public void setImage_Url(String image_Url) {
		this.image_Url = image_Url;
	}

}
