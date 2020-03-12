package com.surendra.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendra.tutorial.Entities.Product;
import com.surendra.tutorial.Repositories.ProductDao;
import com.surendra.tutorial.Repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao productDao;
	
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

}
