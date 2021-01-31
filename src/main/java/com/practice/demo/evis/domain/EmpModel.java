package com.practice.demo.evis.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "EMP2")
public class EmpModel implements Serializable {

    @Id
    @Column(name = "EMPNO", nullable = false)
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
    @JoinColumn(name = "DEPTNO", nullable = false)
    private DeptModel deptModel;
}
