package com.practice.demo.evis.controller;

import com.practice.demo.evis.constants.Constants;
import com.practice.demo.evis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/all")
    public String getAllEmp(final Model model) {

        model.addAttribute(Constants.Attributes.TITLE, Constants.Templates.LISTALL_EMP);
        model.addAttribute("allEmps", empService.getAllEmp());
        return Constants.Templates.LISTALL_EMP;
    }
}
