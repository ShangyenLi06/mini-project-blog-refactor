package com.practice.demo.evis.domain;

import com.practice.demo.evis.domain.DeptModel;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "EMP2")
public class EmpModel implements Serializable {

    @Id
    @NonNull
    @Column(name = "empno")
    private Integer empno;

    @NonNull
    @Column(name = "ename")
    private String ename;

    @NonNull
    @Column(name = "job")
    private String job;

    @NonNull
    @Column(name = "hiredate")
    private Date hiredate;

    @NonNull
    @Column(name = "sal")
    private Double sal;

    @NonNull
    @Column(name = "comm")
    private Double comm;

    @ManyToOne
    @JoinColumn(name = "DEPT2")
    private DeptModel deptModel;
}
