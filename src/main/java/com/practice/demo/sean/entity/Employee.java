package com.practice.demo.sean.entity;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
@Entity
@Table(name= "EMPLOYEE")
public class Employee implements java.io.Serializable {

    @Id
	@Column(name = "EMPNO")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne
    @JoinColumn(name = "DEPTNO")
    @JsonIgnore
	private Department department;
}
