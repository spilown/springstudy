package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import com.example.demo.dto.carallocation.CarallocationReturnSignature;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@DynamicUpdate
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="CAR_RETURN", schema = "tk_bodev")
public class CarallocationReturnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DELIVER_SEQ")
    @SequenceGenerator(sequenceName = "DELIVER_SEQ", allocationSize = 1, name = "DELIVER_SEQ")
    @Column(name = "CAR_RETURN_ID")
    private long carReturnId;
    private String funCtrlNo;
    private String signature;
    @Column(name = "REG_EMPNO")
    private String regEmpno;
    @CreationTimestamp
    @Column(name = "REG_DATE")
    private LocalDateTime regDate;
    private String deliveryArea;
    private String etcMemo;

    @OneToMany(mappedBy = "carReturn",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarReturnInfoEntity> addCh013ds = new ArrayList<>();

    @Builder
    public CarallocationReturnEntity(CarallocationReturnSignature returnSignature) {
        this.carReturnId = returnSignature.getCarReturnId();
        this.funCtrlNo = returnSignature.getFunCtrlNo();
        this.signature = returnSignature.getSignature();
        this.regEmpno = returnSignature.getRegEmpno();
        this.regDate = returnSignature.getRegDate();
        this.deliveryArea = returnSignature.getDeliveryArea();
        this.etcMemo = returnSignature.getEtcMemo();
    }

    public void addReturn(CarReturnInfoEntity returnEntity) {
        addCh013ds.add(returnEntity);
        returnEntity.setCarReturn(this);
    }

}
