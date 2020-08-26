package com.yedam.classes;

public class MainEx {
	static final int age=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend fr=new Friend();
		//calculator cal=new calculator();
		calculator.add(10, 10);
		final int val=10;
		
		
		fr.setAge(10);
		runInt(fr.getAge());
		runFriend(fr);
		
		System.out.println(age);
	}
	public static void runFriend(Friend fr) {
		System.out.println(fr.toString());
	}
	public static void runInt(int a) {
		System.out.println(a);
	}
}
