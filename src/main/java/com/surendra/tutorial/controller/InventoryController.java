package com.surendra.tutorial.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.surendra.tutorial.Entities.Inventory;
import com.surendra.tutorial.Entities.Product;
import com.surendra.tutorial.reqest.InventoryReqest;
import com.surendra.tutorial.reqest.MultipleRequest;
import com.surendra.tutorial.reqest.ProductRequest;
import com.surendra.tutorial.services.InventoryService;
import com.surendra.tutorial.services.ProductService;

@RestController
public class InventoryController {
	@Autowired
	InventoryService inventoryService;
	@Autowired
	ProductService productService;
	
	@PostMapping(value="/inventories/inventory")
	public ResponseEntity<Object> addInventory(@Valid @RequestBody MultipleRequest multipleRequest) {
		ResponseEntity<Object> responseEntity = null;
		
		Inventory inv = new Inventory();
		Product prod = new Product();
		
		inv.setInventoryName(multipleRequest.getInventoryReqest().getInventoryName());
		prod.setProductName(multipleRequest.getProductRequest().getProductName());
		
		inv.setProduct(prod);
		prod.setInventory(inv);
		inventoryService.addInventory(inv);
		
		
		responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
		
	}

}
