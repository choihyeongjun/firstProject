package com.yedam.oper;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charcode='A';
		if(charcode>=65&charcode<=90)
		{
			System.out.println("대문자입니다");
		}
		int num1=10;
		int num2=20;
		if(num1++<10 || num2++<20)
		{
			System.out.println("참참참");
		}
		System.out.println(num1+","+num2);
		int result=30<<25;
		System.out.println(result);
		
		
		
		
	}

}
