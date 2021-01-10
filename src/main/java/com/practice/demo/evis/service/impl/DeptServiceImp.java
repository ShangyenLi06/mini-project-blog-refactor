package com.practice.demo.evis.service.impl;

import com.practice.demo.evis.dao.DeptDao;
import com.practice.demo.evis.domain.DeptModel;
import com.practice.demo.evis.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    protected final DeptDao deptDao;

    public DeptServiceImp(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public List<DeptModel> getAllDept() {
        return deptDao.findAll();
    }

    @Override
    public DeptModel getDeptByDeptno(String deptno) {
        return deptDao.findById(deptno).orElse(new DeptModel());
    }
}
