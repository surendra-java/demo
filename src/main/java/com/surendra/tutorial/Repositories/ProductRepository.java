package com.surendra.tutorial.Repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.surendra.tutorial.Entities.Inventory;
import com.surendra.tutorial.Entities.Product;

@Repository
public class ProductRepository implements ProductDao {
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void addProduct(Product product) {
		em.persist(product);
	}
}
