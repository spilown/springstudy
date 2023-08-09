package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarReturnInfoEntity;

public interface CarReturnInfoRepo extends JpaRepository<CarReturnInfoEntity, Long>{
    
}
