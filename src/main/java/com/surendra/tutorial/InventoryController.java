package com.surendra.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

import com.surendra.tutorial.Entities.Inventory;
import com.surendra.tutorial.services.InventoryServiceImpl;

public class InventoryController {
	@Autowired
	InventoryServiceImpl inventoryServiceImpl;
	public void checl() {
		Inventory inv = new Inventory();
		inv.setInventoryName("surendra");
		inventoryServiceImpl.addInventory(inv);
	}

}
