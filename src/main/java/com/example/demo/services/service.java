package com.example.demo.services;

import com.example.demo.entity.Employee;
import com.example.demo.repository.empRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    empRepository empRepo;
    public void saveEmpDetails(Employee emp){
        empRepo.save(emp);
    }

}
