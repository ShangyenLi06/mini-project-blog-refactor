package com.practice.demo.evis.service;

import com.practice.demo.evis.data.EmpData;

import java.util.List;

public interface EmpService {

    List<EmpData> getAllEmp();

    EmpData getEmpByCode(final String code);
}
