package com.practice.demo.evis.domain.emp;

import com.practice.demo.evis.domain.dept.DeptModel;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "EMP2")
public class EmpModel implements java.io.Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Double sal;
    private Double comm;

    @ManyToOne
    @JoinColumn(name = "DEPT2")
    private DeptModel deptModel;

    @Id
    @Column(name = "deptno", nullable = false)
    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    @Column(name = "ename", nullable = false)
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Column(name = "job", nullable = false)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Column(name = "hiredate", nullable = false)
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Column(name = "sal", nullable = false)
    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    @Column(name = "comm", nullable = false)
    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

}
