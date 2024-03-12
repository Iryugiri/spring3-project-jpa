package com.metareports.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metareports.project.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
