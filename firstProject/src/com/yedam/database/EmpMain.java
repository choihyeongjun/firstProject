package com.yedam.database;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		Scanner scn=new Scanner(System.in);
		EmpService service=new EmpServiceImpl();
		
		while(run)
		{
			System.out.println("------------------------------");
			System.out.println("1.리스트 2.입력 3.수정 4.삭제 9.종료");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			int selectNo=scn.nextInt();
			if(selectNo==1) {
				EmpDAO dao=new EmpDAO();
				Employee[] emps=service.showList()//dao.getEmpList();
				for(Employee emp:emps)
				{
					if(emp!=null)
					System.out.println(emp.toString());
				}
				
			} else if(selectNo==2) {
				EmpDAO dao=new EmpDAO();
				int num=scn.nextInt();
				String n2=scn.next();
				String n3=scn.next();
				String n4=scn.next();//날짜
				String n5=scn.next();
				Employee emp=new Employee(num,n2,n3,n4,n5);
				service.addEmp(emp);//dao.addEmployee(emp);
			} else if(selectNo==3) {
				EmpDAO dao=new EmpDAO();
				
				
				Employee emp=new Employee();
				Employee emp1=new Employee();
				System.out.println("수정값");
				int before=scn.nextInt();
				emp.setEmployeeId(before);
				System.out.println("수정할대상");
				int after=scn.nextInt();
				emp1.setEmployeeId(after);
				service.modEmp(emp, emp1);//dao.alterEmployee(emp, emp1);
			} else if(selectNo==4) {
				EmpDAO dao=new EmpDAO();
				int d=scn.nextInt();
				Employee emp=new Employee();
				emp.setEmployeeId(d);
				service.delEmp(emp.getEmployeeId());//dao.removeEmployee(emp.getEmployeeId());
			} else if(selectNo==9) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

}
