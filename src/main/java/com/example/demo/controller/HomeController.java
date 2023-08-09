package com.example.demo.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.CarallocationReturnEntity;
import com.example.demo.repository.CarAllocationReturnRepo;
import com.example.demo.repository.CarReturnInfoRepo;
import com.example.demo.repository.TestRepo;
import com.example.demo.repository.UserRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final TestRepo repo;
    private final UserRepo userRepo;
    private final CarAllocationReturnRepo carReturnRepo;
    private final CarReturnInfoRepo carReturnInfoRepo;

    @GetMapping("/")
    public String main() {

        // List<TestEntity> list = repo.findAll();
        Pageable limit = PageRequest.of(0,10);
        
        Page<CarallocationReturnEntity> list =carReturnRepo.findAll(limit);
        for (CarallocationReturnEntity testEntity : list) {
            log.info("result: {}", testEntity);
            
        }

     /*     Page<CarReturnInfoEntity> list2 =carReturnInfoRepo.findAll(limit);
        for (CarReturnInfoEntity testEntity : list2) {
            log.info("result2: {}", testEntity);
            
        }
        */ 
        return "mainPage";
    }
}
