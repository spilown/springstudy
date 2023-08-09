package com.example.demo.repositoryImpl;

import com.example.demo.repository.TestRepoCustom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class TestRepoImpl implements TestRepoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public String testCustomLogic() {
        // TODO Auto-generated method stub
        return null;
    }



    
}
