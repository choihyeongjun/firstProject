package com.yedam.classes;

public class CalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cal=new Cal();
		cal.r=5;
		cal.setRadius(5);
		
		System.out.println("반지름:" +cal.setRadius(5)+"의 넓이는"+cal.getArea());
		print(200.5);
		
		
	}
	
	public static void print(double a)
	{
		System.out.println("입력값은 :"+a+"입니다");
	}

}
