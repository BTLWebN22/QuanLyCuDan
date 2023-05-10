package com.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Apartment;

public interface ManagerService extends JpaRepository<Apartment, Long>{
	
}
