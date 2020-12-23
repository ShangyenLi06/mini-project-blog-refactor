package com.practice.demo.sean.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "EMPLOYEE")
public class Employee implements java.io.Serializable {
	@Column(name = "EMPNO")
	private Integer empno;
	@Column(name = "ENAME")
	private String ename;
	@Column(name = "JOB")
	private String job;
	@Column(name = "HIREDATE")
	private Date hiredate;
	@Column(name = "SAL")
	private Double sal;
	@Column(name = "COMM")
	private Double comm;
	@Column(name = "DEPTNO")
	private Integer deptno;
}
