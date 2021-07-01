package com.dell.webapp.model;

import java.util.Date;

// This is  Encapsulated class, POJO,  Bean
public class Product {
	
	// properties
	private int id;
	private String name;
	private Double price;
	private Date createdAt;
	private Date modifiedAt;
	
	// constructor
	public Product() {}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
		this.createdAt =  new Date();
		this.modifiedAt = new Date();
	}
	
	public Product(int id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.createdAt =  new Date();
		this.modifiedAt = new Date();
	}
	
	//get & set methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", createdAt=" + createdAt
				+ ", modifiedAt=" + modifiedAt + "]";
	}
}
