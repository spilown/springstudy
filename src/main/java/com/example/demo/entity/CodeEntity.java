package com.example.demo.entity;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(exclude = "carReturnInfo")
@Immutable
@Table(name="add_ch013d", schema = "tk_bodev")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADD_CH013D_SEQ")
    @SequenceGenerator(sequenceName = "ADD_CH013D_SEQ", allocationSize = 1, name = "ADD_CH013D_SEQ")
    private long seq;
    @NotNull
    @Column(name = "fun_ctrl_no")
    private String funCtrlNo;
    @NotNull
    private String xender;
    @NotNull
    private String item;
    private int sceneYedahamCount;
    private int sceneOuterCount;
    private int deliveryYedahamCount;
    private int deliveryOuterCount;
    private int etcYedahamCount;
    private int etcOuterCount;
    private String type;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_return_id", referencedColumnName="CAR_RETURN_ID")
    private CarReturnEntity carReturnInfo;


}
