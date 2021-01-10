package com.practice.demo.evis.domain;

import com.practice.demo.evis.domain.DeptModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "EMP2")
public class EmpModel implements Serializable {

    @Id
    @Column(name = "empno", nullable = false)
    private Integer empno;

    @Column(name = "ename", nullable = false)
    private String ename;

    @Column(name = "job", nullable = false)
    private String job;

    @Column(name = "hiredate", nullable = false)
    private Date hiredate;

    @Column(name = "sal", nullable = false)
    private Double sal;

    @Column(name = "comm", nullable = false)
    private Double comm;

    @ManyToOne
    @JoinColumn(name = "DEPT2")
    private DeptModel deptModel;
}
