package com.yedam.inherit;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child("홍길동",15,10);
		child.getName();
		child.getAge();
		child.getGrade();
		Parent parent=new Child("김유산",20,20);
		Vehicle v1=new Taxi();
		v1.run();
		v1=new Bus();
		v1.run();
		
		Driver driver=new Driver();
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		Parent parent1=new Parent();
		System.out.println(parent1.toString());
	}

}
