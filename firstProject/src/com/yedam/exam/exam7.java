package com.yedam.exam;
import java.util.Scanner;
public class exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
	
		int balance=0;
		int money=0;
		while(run)
		{
			System.out.println("---------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료 ");
			System.out.println("---------------");
			int menu=scanner.nextInt();
			 
			if (menu==1)
			{
				System.out.println("얼마를 입금하시겠슴까");
				money=scanner.nextInt();
				balance+=money;
				System.out.println("현재 잔고는"+balance+"입니다");
			}
			else if(menu==2)
			{
				System.out.println("얼마를 출금하시겠슴까");
				money=scanner.nextInt();
				balance-=money;
				System.out.println("현재 잔고는"+balance+"입니다");
			}
			else if(menu==3)
			{
				System.out.println("현재 잔고는"+balance+"입니다");
			}
			else if(menu==4)
				run=false;
		}
	}

}
