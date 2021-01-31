package com.practice.demo.evis.populator.impl;

import com.practice.demo.evis.data.DeptData;
import com.practice.demo.evis.data.EmpData;
import com.practice.demo.evis.domain.EmpModel;
import com.practice.demo.evis.populator.Populator;
import org.springframework.stereotype.Component;

@Component
public class EmpPopulator implements Populator<EmpModel, EmpData> {

    private final DeptPopulator deptPopulator;

    public EmpPopulator(DeptPopulator deptPopulator) {
        this.deptPopulator = deptPopulator;
    }

    @Override
    public void populate(EmpModel empModel, EmpData empData) {

        empData.setEmpno(empModel.getEmpno());
        empData.setComm(empModel.getComm());
        empData.setEname(empModel.getEname());
        empData.setHiredate(empModel.getHiredate());
        empData.setJob(empModel.getJob());
        empData.setSal(empModel.getSal());

        final DeptData deptData = new DeptData();
        getDeptPopulator().populate(empModel.getDeptModel(), deptData);
        empData.setDept(deptData);
    }

    public DeptPopulator getDeptPopulator() {
        return deptPopulator;
    }
}
