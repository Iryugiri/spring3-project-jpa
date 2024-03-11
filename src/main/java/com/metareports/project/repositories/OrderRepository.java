package com.metareports.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metareports.project.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
