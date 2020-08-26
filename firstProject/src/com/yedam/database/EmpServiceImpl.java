package com.yedam.database;

public class EmpServiceImpl implements EmpService {

	EmpDAO dao=new EmpDAO();
	@Override
	public Employee[] showList() {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}

	@Override
	public void addEmp(Employee emp) {
		// TODO Auto-generated method stub
		dao.addEmployee(emp);
	}

	@Override
	public void modEmp(Employee emp,Employee emp1) {
		// TODO Auto-generated method stub
		dao.alterEmployee(emp,emp1);
	}

	@Override
	public void delEmp(int empId) {
		// TODO Auto-generated method stub
		dao.removeEmployee(empId);
	}
	
}
