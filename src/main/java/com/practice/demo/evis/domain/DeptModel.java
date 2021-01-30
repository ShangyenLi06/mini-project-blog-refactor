package com.practice.demo.evis.domain;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name="DEPT2")
public class DeptModel implements Serializable {

    @Id
    @NonNull
    @Column(name="DEPTNO")
    public String deptno = "";

    @NonNull
    @Column(name="DNAME")
    public String dname = "";

    @Column(name="LOC")
    public String loc;

}
