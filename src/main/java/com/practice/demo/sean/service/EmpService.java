package com.practice.demo.sean.service;

import com.practice.demo.sean.entity.Employee;
import com.practice.demo.sean.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    public List<Employee> getAllEmployeeForSelect(){
        return empRepository.findAll();
    }

}
