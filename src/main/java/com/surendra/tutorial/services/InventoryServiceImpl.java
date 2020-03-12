package com.surendra.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.surendra.tutorial.Entities.Inventory;
import com.surendra.tutorial.Repositories.InventoryDao;
import com.surendra.tutorial.Repositories.InventoryRepository;


@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	InventoryDao inventoryDao;

	
	public void addInventory(Inventory inventory) {
		inventoryDao.addInventory(inventory);
	}
	
	

}
