package com.practice.demo.sean.repository;

import com.practice.demo.sean.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepository extends JpaRepository<Employee, String> {

}
