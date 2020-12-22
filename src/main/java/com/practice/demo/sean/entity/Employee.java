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
	@Column
	private Integer empno;
	@Column
	private String ename;
	@Column
	private String job;
	@Column
	private Date hiredate;
	@Column
	private Double sal;
	@Column
	private Double comm;
	@Column
	private Integer deptno;
}
