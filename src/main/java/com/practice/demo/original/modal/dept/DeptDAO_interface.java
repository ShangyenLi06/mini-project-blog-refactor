package com.practice.demo.original.modal.dept;

import java.util.*;
import com.practice.demo.original.modal.emp.EmpVO;

public interface DeptDAO_interface {
	      public void insert(DeptVO deptVO);
          public void update(DeptVO deptVO);
          public void delete(Integer deptno);
          public DeptVO findByPrimaryKey(Integer deptno);
	      public List<DeptVO> getAll();
	      //�d�߬Y���������u(�@��h)(�^�� Set)
	      public Set<EmpVO> getEmpsByDeptno(Integer deptno);
}
