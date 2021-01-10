//package com.practice.demo.original.modal.dept;
//
//import java.util.*;
//import java.sql.*;
//
//import com.emp.model.EmpVO;
//
//public class DeptJDBCDAO implements DeptDAO_interface {
//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@localhost:1521:XE";
//	String userid = "hr";
//	String passwd = "123456";
//
//	private static final String INSERT_STMT = "INSERT INTO dept2 (deptno,dname,loc) VALUES (dept2_seq.NEXTVAL, ?, ?)";
//	private static final String GET_ALL_STMT = "SELECT deptno , dname, loc FROM dept2";
//	private static final String GET_ONE_STMT = "SELECT deptno , dname, loc FROM dept2 where deptno = ?";
//	private static final String GET_Emps_ByDeptno_STMT = "SELECT empno,ename,job,to_char(hiredate,'yyyy-mm-dd') hiredate,sal,comm,deptno FROM emp2 where deptno = ? order by empno";
//
//	private static final String DELETE_EMPs = "DELETE FROM emp2 where deptno = ?";
//	private static final String DELETE_DEPT = "DELETE FROM dept2 where deptno = ?";
//
//	private static final String UPDATE = "UPDATE dept2 set dname=?, loc=? where deptno = ?";
//
//	@Override
//	public void insert(DeptVO deptVO) {
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//
//		try {
//
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			pstmt = con.prepareStatement(INSERT_STMT);
//
//			pstmt.setString(1, deptVO.getDname());
//			pstmt.setString(2, deptVO.getLoc());
//
//			pstmt.executeUpdate();
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//			// Clean up JDBC resources
//		} finally {
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//
//	}
//
//	@Override
//	public void update(DeptVO deptVO) {
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//
//		try {
//
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			pstmt = con.prepareStatement(UPDATE);
//
//			pstmt.setString(1, deptVO.getDname());
//			pstmt.setString(2, deptVO.getLoc());
//			pstmt.setInt(3, deptVO.getDeptno());
//
//			pstmt.executeUpdate();
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//			// Clean up JDBC resources
//		} finally {
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//
//	}
//
//	@Override
//	public void delete(Integer deptno) {
//		int updateCount_EMPs = 0;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//
//		try {
//
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//
//			// 1���]�w�� pstm.executeUpdate()���e
//			con.setAutoCommit(false);
//
//			// ���R�����u
//			pstmt = con.prepareStatement(DELETE_EMPs);
//			pstmt.setInt(1, deptno);
//			updateCount_EMPs = pstmt.executeUpdate();
//			// �A�R������
//			pstmt = con.prepareStatement(DELETE_DEPT);
//			pstmt.setInt(1, deptno);
//			pstmt.executeUpdate();
//
//			// 2���]�w�� pstm.executeUpdate()����
//			con.commit();
//			con.setAutoCommit(true);
//			System.out.println("�R�������s��" + deptno + "��,�@�����u" + updateCount_EMPs
//					+ "�H�P�ɳQ�R��");
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			if (con != null) {
//				try {
//					// 3���]�w���exception�o�ͮɤ�catch�϶���
//					con.rollback();
//				} catch (SQLException excep) {
//					throw new RuntimeException("rollback error occured. "
//							+ excep.getMessage());
//				}
//			}
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//		} finally {
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//
//	}
//
//	@Override
//	public DeptVO findByPrimaryKey(Integer deptno) {
//
//		DeptVO deptVO = null;
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			pstmt = con.prepareStatement(GET_ONE_STMT);
//
//			pstmt.setInt(1, deptno);
//
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				// deptVO �]�٬� Domain objects
//				deptVO = new DeptVO();
//				deptVO.setDeptno(rs.getInt("deptno"));
//				deptVO.setDname(rs.getString("dname"));
//				deptVO.setLoc(rs.getString("loc"));
//			}
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//			// Clean up JDBC resources
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//		return deptVO;
//	}
//
//	@Override
//	public List<DeptVO> getAll() {
//		List<DeptVO> list = new ArrayList<DeptVO>();
//		DeptVO deptVO = null;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			pstmt = con.prepareStatement(GET_ALL_STMT);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				deptVO = new DeptVO();
//				deptVO.setDeptno(rs.getInt("deptno"));
//				deptVO.setDname(rs.getString("dname"));
//				deptVO.setLoc(rs.getString("loc"));
//				list.add(deptVO); // Store the row in the list
//			}
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//		return list;
//	}
//
//	@Override
//	public Set<EmpVO> getEmpsByDeptno(Integer deptno) {
//		Set<EmpVO> set = new LinkedHashSet<EmpVO>();
//		EmpVO empVO = null;
//
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//
//			Class.forName(driver);
//			con = DriverManager.getConnection(url, userid, passwd);
//			pstmt = con.prepareStatement(GET_Emps_ByDeptno_STMT);
//			pstmt.setInt(1, deptno);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				empVO = new EmpVO();
//				empVO.setEmpno(rs.getInt("empno"));
//				empVO.setEname(rs.getString("ename"));
//				empVO.setJob(rs.getString("job"));
//				empVO.setHiredate(rs.getDate("hiredate"));
//				empVO.setSal(rs.getDouble("sal"));
//				empVO.setComm(rs.getDouble("comm"));
//				empVO.setDeptno(rs.getInt("deptno"));
//				set.add(empVO); // Store the row in the vector
//			}
//
//			// Handle any driver errors
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException("Couldn't load database driver. "
//					+ e.getMessage());
//			// Handle any SQL errors
//		} catch (SQLException se) {
//			throw new RuntimeException("A database error occured. "
//					+ se.getMessage());
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace(System.err);
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace(System.err);
//				}
//			}
//		}
//		return set;
//	}
//
//	public static void main(String[] args) {
//
//		DeptJDBCDAO dao = new DeptJDBCDAO();
//
//		// �s�W
////		DeptVO deptVO1 = new DeptVO();
////		deptVO1.setDname("�s�y��");
////		deptVO1.setLoc("���ꦿ��");
////		dao.insert(deptVO1);
//
//		// �ק�
////		DeptVO deptVO2 = new DeptVO();
////		deptVO2.setDeptno(10);
////		deptVO2.setDname("�]�ȳ�2");
////		deptVO2.setLoc("�O�W�x�_2");
////		dao.update(deptVO2);
//
//		// �R��
////		dao.delete(30);
//
//		// �d��
////		DeptVO deptVO3 = dao.findByPrimaryKey(10);
////		System.out.print(deptVO3.getDeptno() + ",");
////		System.out.print(deptVO3.getDname() + ",");
////		System.out.println(deptVO3.getLoc());
////		System.out.println("---------------------");
//
//		// �d�߳���
//		List<DeptVO> list = dao.getAll();
//		for (DeptVO aDept : list) {
//			System.out.print(aDept.getDeptno() + ",");
//			System.out.print(aDept.getDname() + ",");
//			System.out.print(aDept.getLoc());
//			System.out.println();
//		}
//
//		// �d�߬Y���������u
//		Set<EmpVO> set = dao.getEmpsByDeptno(10);
//		for (EmpVO aEmp : set) {
//			System.out.print(aEmp.getEmpno() + ",");
//			System.out.print(aEmp.getEname() + ",");
//			System.out.print(aEmp.getJob() + ",");
//			System.out.print(aEmp.getHiredate() + ",");
//			System.out.print(aEmp.getSal() + ",");
//			System.out.print(aEmp.getComm() + ",");
//			System.out.print(aEmp.getDeptno());
//			System.out.println();
//		}
//	}
//}