package com.practice.demo.sean.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@Entity
@Table(name= "DEPARTMENT")
public class Department implements java.io.Serializable {

    @Id
	@Column(name = "DEPTNO")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptno;
	@Column(name = "DNAME")
	private String dname;
	@Column(name = "LOC")
	private String loc;

	@OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Employee> employees;
}
