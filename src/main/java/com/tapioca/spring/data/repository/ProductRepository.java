package com.tapioca.spring.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tapioca.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByName(String name);
	List<Product> findByPrice(Double price);
	List<Product> findByNameAndPrice(String name, Double price);
	
}
