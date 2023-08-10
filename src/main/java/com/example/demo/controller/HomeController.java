package com.example.demo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.test.TestRequest;
import com.example.demo.entity.CarReturnEntity;
import com.example.demo.entity.CodeEntity;
import com.example.demo.repository.CarReturnRepo;
import com.example.demo.repository.CodeRepo;
import com.example.demo.repository.TestRepo;
import com.example.demo.repository.UserRepo;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final TestRepo repo;
    private final UserRepo userRepo;
    private final CarReturnRepo carReturnRepo;
    private final CodeRepo carReturnInfoRepo;

    @ResponseBody
    @GetMapping("/")
    public String main() {

        
        List<CodeEntity> list = carReturnInfoRepo.findByFunCtrlNo("2022010196");
        log.info("list size: {}", list.size());

        CodeEntity CE = list.get(0);
        CarReturnEntity carReturn = CE.getCarReturnInfo();
        log.info(carReturn.getUser().toString());

        // for (CodeEntity carReturnInfoEntity : list) {
        //     log.info("carReturnInfoEntity: {}", carReturnInfoEntity.getCarReturnInfo());
        // }
       
        return "mainPage";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test( @Valid TestRequest testrequest, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            for(FieldError err: bindingResult.getFieldErrors()) {
                log.info("err field: {}  reason: {}", err.getField(), err.getDefaultMessage());
            }
        }
        

        return testrequest.toString();

    }
}
