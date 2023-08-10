package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString(exclude = "carAlloc")
@Immutable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "hr001m", schema = "TK_ITSMDEV")
public class UserEntity {
    @Id
    @Column(name = "EMPNO")
    private String empno;

    
    @Column(name = "EMPNM1")
    private String empnm1;

    @OneToMany(mappedBy = "user")
    List<CarReturnEntity> carAlloc = new ArrayList();


}
