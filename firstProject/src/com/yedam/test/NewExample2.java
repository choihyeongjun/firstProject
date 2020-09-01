package com.yedam.test;

public class NewExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=nvl(null,"초기값");
		System.out.println(result);
		result=nvl("입력값","초기값");
		System.out.println(result);
	}
	public static String nvl(String str1,String defaultValue) {
		if(str1!=null)
			return str1;
		else
			return defaultValue;
	}
}
