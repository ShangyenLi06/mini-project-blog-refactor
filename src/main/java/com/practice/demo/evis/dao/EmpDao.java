package com.practice.demo.evis.dao;

import com.practice.demo.evis.domain.EmpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * this class only need to extends the interface unless you need to override the method
 */
@Repository // told the application this one is dao
public interface EmpDao extends JpaRepository<EmpModel, String>, JpaSpecificationExecutor<EmpModel> {
}
