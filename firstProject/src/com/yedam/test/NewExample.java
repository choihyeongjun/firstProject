package com.yedam.test;

class Math{
	
	public static double min(double a,double b) {
		if(a>b)
		{
			return b;
		}
		else
			return a;
	}
	
}

public class NewExample {
	public static void main(String[] args) {
	double result=Math.min(30.1, 29);
	int result1=(int)Math.min(30, 29);
	System.out.println(result1);
	System.out.println(result);
	}
	
}
