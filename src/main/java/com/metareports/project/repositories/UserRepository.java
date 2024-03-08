package com.metareports.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metareports.project.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
