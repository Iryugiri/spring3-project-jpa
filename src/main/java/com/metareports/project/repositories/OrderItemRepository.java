package com.metareports.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metareports.project.entity.OrderItem;
import com.metareports.project.entity.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
