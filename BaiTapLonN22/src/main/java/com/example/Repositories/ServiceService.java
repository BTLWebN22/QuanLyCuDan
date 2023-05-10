package com.example.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Service;

@Repository
public interface ServiceService extends JpaRepository<Service, Long> {

}
