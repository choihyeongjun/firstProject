package com.yedam.classes;

public class calculatorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cal=new calculator();
		
		System.out.println(cal.add(10,20));
		
		cal.getArea(10.0);
		System.out.println(cal.getRectangle(4, 5));
	}

}
