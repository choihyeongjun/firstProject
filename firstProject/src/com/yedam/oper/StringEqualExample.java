package com.yedam.oper;

public class StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=20;
		int v2=30;
		if(v1==v2)
			System.out.println("기본 탑일경우 비교");
		
		String st1="Hello";
		String st2="Hello";
		String st3=new String("Hello");
		
		if(st1==st2)
			System.out.println("같은문자1");
		else if(st2==st3)
			System.out.println("같은문자2");
		
		System.out.println((1==1)||(2==2));
	}

}
