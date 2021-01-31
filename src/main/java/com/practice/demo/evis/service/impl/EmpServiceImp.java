package com.practice.demo.evis.service.impl;

import com.practice.demo.evis.dao.EmpDao;
import com.practice.demo.evis.data.EmpData;
import com.practice.demo.evis.domain.EmpModel;
import com.practice.demo.evis.populator.impl.AbstractConverter;
import com.practice.demo.evis.populator.impl.EmpPopulator;
import com.practice.demo.evis.service.EmpService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImp implements EmpService {

    protected final EmpDao empDao;
    protected final EmpPopulator empPopulator;
    protected final AbstractConverter<EmpModel, EmpData> empConverter;

    public EmpServiceImp(EmpDao empDao, EmpPopulator empPopulator, AbstractConverter<EmpModel, EmpData> empConverter) {
        this.empDao = empDao;
        this.empPopulator = empPopulator;
        empConverter.setTargetClass(EmpData.class);
        empConverter.setPopulatorList(List.of(empPopulator));
        this.empConverter = empConverter;
    }

    @Override
    public List<EmpData> getAllEmp() {
        final List<EmpModel> empModels = getEmpDao().findAll();
        return getEmpConverter().convertAll(empModels);
    }

    @Override
    public EmpData getEmpByCode(String code) {

        EmpData empData = new EmpData();
        final Optional<EmpModel> oEmpModel = empDao.findById(code);
        if (oEmpModel.isPresent()) {
            empData = getEmpConverter().convert(oEmpModel.get());
        }
        return empData;
    }

    public EmpDao getEmpDao() {
        return empDao;
    }

    public AbstractConverter<EmpModel, EmpData> getEmpConverter() {
        return empConverter;
    }
}
