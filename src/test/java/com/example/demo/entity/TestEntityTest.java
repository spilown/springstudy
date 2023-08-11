package com.example.demo.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Transactional
@Slf4j
public class TestEntityTest {
    @Autowired
    EntityManager em;

    @Test
    @DisplayName("querydsl test")
    public void test () {
        JPAQueryFactory query = new JPAQueryFactory(em);
        QTestEntity test = QTestEntity.testEntity;

        TestEntity tn = query.selectFrom(test).fetchFirst();
        log.info(tn.toString());
  
    }
}
