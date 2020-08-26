package com.yedam.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	public void addEmployee(Employee emp) {
		Connection conn=DBConnection.getConnection();
		String sql="insert into emp_temp(employee_id,last_name,email,hire_date,job_id) "
				+"values("+emp.getEmployeeId()+",\'"
				+emp.getLastName()+"\',\' "
				+emp.getEmail()+"\',\'"
				+emp.getHireDate()+"\',\'"
				+emp.getJobId()+"\')";
		System.out.println(sql);
		try {
			PreparedStatement psmt=conn.prepareStatement(sql);
			int r=psmt.executeUpdate();
			System.out.println(r+"건 입력되었습니다");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void alterEmployee(Employee emp,Employee emp1) {
		Connection conn=DBConnection.getConnection();
		String sql="update emp_temp set employee_id="+emp.getEmployeeId()+"where employee_id="
				+emp1.getEmployeeId()+"";
		System.out.println(sql);
		try {
			PreparedStatement psmt=conn.prepareStatement(sql);
			int r=psmt.executeUpdate();
			System.out.println(r+"건 수정되었습니다");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void removeEmployee(int empId) {
		Connection conn=DBConnection.getConnection();
		String sql="delete from emp_temp where employee_id="+empId+"";
		try {
			PreparedStatement psmt=conn.prepareStatement(sql);
			int r=psmt.executeUpdate();
			System.out.println(r+"건 삭제되었습니다");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public Employee[] getEmpList() {
		Connection conn=DBConnection.getConnection();
		Employee[] employees=new Employee[100];
		try {
			String sql="select * from emp_temp";
			PreparedStatement pstmt=conn.prepareStatement("select * from emp_temp");
			ResultSet rs=pstmt.executeQuery();
			int idx=0;
			while(rs.next()) {
				Employee emp=new Employee();
				String firstName=rs.getString("first_name");
				emp.setFirstName(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				employees[idx++]=emp;
			}
			System.out.println("---- end of data --");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}
	

}
