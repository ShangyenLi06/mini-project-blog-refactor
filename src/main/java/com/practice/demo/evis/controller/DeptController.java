package com.practice.demo.evis.controller;

import com.practice.demo.evis.domain.DeptModel;
import com.practice.demo.evis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/test")
    public String HelloWorld(final Model model) {

        final List<DeptModel> allDept = deptService.getAllDept();
        model.addAttribute("firstDept", allDept.stream().map(dept -> dept.dname)
                .findFirst().orElse(""));

        return "HelloWorld";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getAllDept(final Model model) {

        final List<DeptModel> allDept = deptService.getAllDept();
        model.addAttribute("allDept", allDept.stream().map(dept -> dept.dname).collect(Collectors.toList()));

        return "HelloWorld";
    }

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String getOneDept(final Model model, final String deptno) {

        model.addAttribute("selectDept", deptService.getDeptByDeptno(deptno));

        return "HelloWorld";
    }

}
