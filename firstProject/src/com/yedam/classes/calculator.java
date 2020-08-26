package com.yedam.classes;

public class calculator {
	static double pi=3.14;
	
	public static String getRectangle(int a,int b)
	{
		int result=a*b;
		return "가로 "+a+"세로 "+b+"넓이는 "+result+"입니다";
	}
	public static int add(int x,int y) {
		int sum=0;
		sum=x+y;
		return sum;
	}
	
	public static double add(double x,double y) {
		return x+y;
	}
	public static void getArea(double a) {
		double result=pi*a*a;
		System.out.println("반지름"+a+ "의 넓이는"+result);
		
	}
}
