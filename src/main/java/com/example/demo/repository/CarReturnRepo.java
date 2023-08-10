package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarReturnEntity;

public interface CarReturnRepo extends JpaRepository<CarReturnEntity, Long> {
    
}
