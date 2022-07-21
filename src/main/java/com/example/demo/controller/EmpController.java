package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    service service  ;
    @PostMapping(value = "/emp")
    public void addEmpDetails(@RequestBody Employee employee){
       service.saveEmpDetails(employee);
    }
}
