package com.surendra.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.surendra.tutorial.Entities.Inventory;
import com.surendra.tutorial.Repositories.InventoryRepository;


@Service
public class InventoryServiceImpl{
	
	@Autowired
	InventoryRepository inventoryRepository;

	
	public void addInventory(Inventory inventory) {
		inventoryRepository.save(inventory);
	}
	
	

}
