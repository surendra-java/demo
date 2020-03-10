package com.surendra.tutorial.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.surendra.tutorial.Entities.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String>{

}
