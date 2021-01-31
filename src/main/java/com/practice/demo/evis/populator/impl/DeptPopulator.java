package com.practice.demo.evis.populator.impl;

import com.practice.demo.evis.data.DeptData;
import com.practice.demo.evis.domain.DeptModel;
import com.practice.demo.evis.populator.Populator;
import org.springframework.stereotype.Component;

@Component
public class DeptPopulator implements Populator<DeptModel, DeptData> {

    @Override
    public void populate(DeptModel deptModel, DeptData deptData) {
        deptData.setDeptno(deptModel.getDeptno());
        deptData.setDname(deptModel.getDname());
        deptData.setLoc(deptModel.getLoc());
    }
}
