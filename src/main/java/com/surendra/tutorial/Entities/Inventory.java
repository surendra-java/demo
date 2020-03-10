package com.surendra.tutorial.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory", schema = "inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String inventoryId;
	private String inventoryName;
	
	@Column(name = "inventory_id")
	public String getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	
	@Column(name = "inventory_name")
	public String getInventoryName() {
		return inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	
	
	
	

}
