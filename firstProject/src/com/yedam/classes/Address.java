package com.yedam.classes;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Friend[] friends=null;
		Scanner scn=new Scanner(System.in);
		boolean run=true;
		
		Friend ad1=new Friend("101",111,"ddd");
		
		
		while(run)
		{
			System.out.println("------------------------------");
			System.out.println("1.정보 입력 2,알빠냐");
			System.out.println("------------------------------");
			int seno=scn.nextInt();
			if(seno==1)
			{
				
			
			}
		}
		System.out.println("프로그램 종료");
	}

}
