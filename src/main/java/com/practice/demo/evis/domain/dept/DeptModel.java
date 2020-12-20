package com.practice.demo.evis.domain.dept;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPT2")
public class DeptModel implements java.io.Serializable {
    private Integer deptno;
    private String dname;
    private String loc;

    @Id
    @Column(name="deptno", nullable = false)
    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Column(name="dname", nullable = false)
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Column(name="loc", nullable = true)
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
