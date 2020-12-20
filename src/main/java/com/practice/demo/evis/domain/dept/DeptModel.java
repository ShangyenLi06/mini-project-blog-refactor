package com.practice.demo.evis.domain.dept;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="DEPT2")
public class DeptModel implements java.io.Serializable {

    @Id
    @Column(name="deptno", nullable = false)
    public String deptno;

    @Column(name="dname", nullable = false)
    private String dname;

    @Column(name="loc", nullable = true)
    private String loc;

}
