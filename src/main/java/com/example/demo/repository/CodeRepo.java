package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CodeEntity;

public interface CodeRepo extends JpaRepository<CodeEntity, Long>{

    List<CodeEntity> findByFunCtrlNo(String funCtrlNo);
    
}
