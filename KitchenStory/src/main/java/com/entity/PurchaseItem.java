package com.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class PurchaseItem { 


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	
	
	@ManyToOne
	@JoinColumn(name = "purchaseOrder_fk")
	private PurchaseOrder purchaseOrder;
	


	@ManyToOne
	@JoinColumn(name = "product_fk")
	private Products poduct;

	
	@ManyToOne
	@JoinColumn(name = "user_fk")
	private User user;

	private BigDecimal rate;

	private int quantity;

	private BigDecimal price;

	public PurchaseItem(Long iD, Products poduct, User user, BigDecimal rate, int quantity, BigDecimal price) {
		super();
		ID = iD;
		this.poduct = poduct;
		this.user = user;
		this.rate = rate;
		this.quantity = quantity;
		this.price = price;
	}

	public PurchaseItem() {
	
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Products getPoduct() {
		return poduct;
	}

	public void setPoduct(Products poduct) {
		this.poduct = poduct;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	@Override
	public String toString() {
		return "PurchaseItem [ID=" + ID + ", poduct=" + poduct + ", user=" + user + ", rate=" + rate + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
}
