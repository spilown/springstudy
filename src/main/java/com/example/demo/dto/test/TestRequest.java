package com.example.demo.dto.test;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class TestRequest {
    @NotNull
    String name;

    @Min(value = 10)
    int age;
}
