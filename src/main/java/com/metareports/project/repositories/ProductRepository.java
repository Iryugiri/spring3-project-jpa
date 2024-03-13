package com.metareports.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metareports.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
