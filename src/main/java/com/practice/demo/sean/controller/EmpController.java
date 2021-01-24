package com.practice.demo.sean.controller;

import com.practice.demo.sean.entity.Employee;
import com.practice.demo.sean.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import java.util.List;

@Api(tags="empController" ,description="員工相關功能api")
@RestController
@RequestMapping("/demo/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/getAllEmployeeForSelect")
    public List<Employee> getAllEmployeeForSelect() {
        return empService.getAllEmployeeForSelect();
    }

}
