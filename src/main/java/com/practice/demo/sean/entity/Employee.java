package com.practice.demo.sean.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "EMPLOYEE")
public class Employee implements java.io.Serializable {
	private Integer empno;
	private String ename;
	private String job;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
}
