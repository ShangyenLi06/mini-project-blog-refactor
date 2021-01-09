package com.practice.demo.sean.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags="empController" ,description="員工相關功能api")
@RestController
@RequestMapping("/demo/emp")
public class EmpController {

}
