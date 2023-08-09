package com.example.demo.dto.carallocation;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarallocationReturnSignature {
    private long carReturnId;
    private String funCtrlNo;
    private String signature;
    private String regEmpno;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime regDate;
    private String deliveryArea;
    private String etcMemo;
}
