package com.surendra.tutorial.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product", schema = "inventory")
public class Product {
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String productId;
	private String productName;
	
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "product")
	private Inventory inventory;
	
	@Column(name="product_id")
	public String getProductId() {
		return productId;
	}
	
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	@Column(name="product_name")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	

}
