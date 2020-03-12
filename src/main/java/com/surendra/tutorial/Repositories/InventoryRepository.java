package com.surendra.tutorial.Repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.surendra.tutorial.Entities.Inventory;


@Repository
public class InventoryRepository implements InventoryDao   {
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void addInventory(Inventory inventory) {
		em.persist(inventory);
	}

}
