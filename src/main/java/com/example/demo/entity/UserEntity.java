package com.example.demo.entity;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@Immutable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "hr001m", schema = "TK_ITSMDEV")
public class UserEntity {
    @Id
    @Column(name = "EMPNO")
    String empno;
    @Column(name = "EMPNM1")
    String empnm1;
}
