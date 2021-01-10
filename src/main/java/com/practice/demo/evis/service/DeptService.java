package com.practice.demo.evis.service;

import com.practice.demo.evis.domain.DeptModel;

import java.util.List;

public interface DeptService {

    List<DeptModel> getAllDept();

    DeptModel getDeptByDeptno(final String deptno);
}
