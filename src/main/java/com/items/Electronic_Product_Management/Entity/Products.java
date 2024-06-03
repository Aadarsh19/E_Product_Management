package com.items.Electronic_Product_Management.Entity;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	public String name;
	public String brand;
	private double price;
	
	@Column(columnDefinition="TEXT")
	private String description;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Products(int pId, String name, String brand, double price, String description, Date createdAt,
			String imgFileName) {
		super();
		this.pId = pId;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.description = description;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
