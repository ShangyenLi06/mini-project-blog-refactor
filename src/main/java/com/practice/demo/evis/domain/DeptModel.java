package com.practice.demo.evis.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "DEPT2")
public class DeptModel implements Serializable {

    @Id
    @Column(name = "DEPTNO")
    public String deptno;

    @Column(name = "DNAME", nullable = false)
    public String dname;

    @Column(name = "LOC", nullable = false)
    public String loc;

}
