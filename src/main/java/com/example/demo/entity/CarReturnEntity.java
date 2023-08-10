package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@DynamicUpdate
@ToString(exclude = {"codeEntities", "user"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="CAR_RETURN", schema = "tk_bodev")
public class CarReturnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DELIVER_SEQ")
    @SequenceGenerator(sequenceName = "DELIVER_SEQ", allocationSize = 1, name = "DELIVER_SEQ")
    private String funCtrlNo;

    private String signature;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REG_EMPNO")
    private UserEntity user;

    
    @OneToMany(mappedBy = "carReturnInfo",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CodeEntity> codeEntities = new ArrayList<>();

    @Column(name= "CAR_RETURN_ID")
    private Long carReturnId;

    @CreationTimestamp
    @Column(name = "REG_DATE")
    private LocalDateTime regDate;
    private String deliveryArea;
    private String etcMemo;





}
