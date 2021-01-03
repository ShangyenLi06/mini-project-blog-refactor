package com.practice.demo.original.modal.dept;

import java.util.List;
import java.util.Set;
import com.practice.demo.original.modal.emp.EmpVO;

public class DeptService {

	private DeptDAO_interface dao;

	public DeptService() {
		dao = new DeptDAO();
	}

	public List<DeptVO> getAll() {
		return dao.getAll();
	}

	public DeptVO getOneDept(Integer deptno) {
		return dao.findByPrimaryKey(deptno);
	}

	public Set<EmpVO> getEmpsByDeptno(Integer deptno) {
		return dao.getEmpsByDeptno(deptno);
	}

	public void deleteDept(Integer deptno) {
		dao.delete(deptno);
	}
}
