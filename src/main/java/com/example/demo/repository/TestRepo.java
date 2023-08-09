package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TestEntity;

public interface TestRepo extends JpaRepository<TestEntity, String>, TestRepoCustom {
    
}
