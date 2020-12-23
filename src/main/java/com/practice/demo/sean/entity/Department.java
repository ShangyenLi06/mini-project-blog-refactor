package com.practice.demo.sean.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "DEPARTMENT")
public class Department implements java.io.Serializable {
	@Column(name = "DEPTNO")
	private Integer deptno;
	@Column(name = "DNAME")
	private String dname;
	@Column(name = "LOC")
	private String loc;
}
