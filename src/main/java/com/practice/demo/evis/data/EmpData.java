package com.practice.demo.evis.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.sql.Date;

@Data
@NoArgsConstructor
public class EmpData {

    @NonNull
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private DeptData dept;
}
