package com.yedam.execption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		try {
		System.out.println(str.toString());
		}
		catch(NullPointerException e) {
			System.out.println("null 값 참조중");
			
		}catch(Exception e1) {
			System.out.println("에외ㅏ 발생");
		}
		int[] intAry=new int[5];
		for(int i=0;i<=5;i++)
		{
			try {
				System.out.println(intAry[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했슴다");
			}
		}
		Scanner scn=new Scanner(System.in);
		System.out.println("숫자입력");
		try {
		int menu=scn.nextInt();
		}
		catch(InputMismatchException e3) {
			System.out.println("숫자가 입력되이낭");
		}
		
		System.out.println("프로그램 정상종료");
	}

}
