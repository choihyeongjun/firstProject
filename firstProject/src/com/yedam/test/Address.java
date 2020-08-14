package com.yedam.test;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=0,number=0;
		String name=null;
		
		Scanner scanner=new Scanner(System.in);
		friend[] ad= null;
		boolean run=true;
		
		
		while(run)
		{
		
		System.out.println("------------------------------------------");
		System.out.println("1.정보입력 2.리스트 3.이름조회 4.이름조회후 수정 9.종료");
		System.out.println("------------------------------------------");
		
		
		int seno=scanner.nextInt();
		if(seno==1)
		{
			System.out.println("정보 입력횟수");
			int num=scanner.nextInt();
			ad=new friend[num];
		for(int i=0;i<ad.length;i++)	
		{	
			
			name=scanner.next();
			age=scanner.nextInt();
			number=scanner.nextInt();
			
			friend add=new friend(name,age,number);	
			ad[i]= add;
		}
		
		}
		else if(seno==2)
		{
			System.out.println("리스트 출력");
			for(int i=0;i<ad.length;i++)	
			{	
				System.out.println(ad[i].getfriend());
			}
		}
		else if(seno==3)
		{
			
			System.out.println("이름 조회하기 ");
			System.out.println("조회할 이름을 입력하시오");
			String Nname=null;
			Nname=scanner.next();
			for(int i=0;i<ad.length;i++)	
			{	
				if(ad[i].name.equals(Nname))
					System.out.println(ad[i].getfriend());
				
			}
		}
			else if(seno==4)
			{
				System.out.println("이름 조회하기 ");
				System.out.println("조회할 이름을 입력하시오");
				String Nname=scanner.next();
				for(int i=0;i<ad.length;i++)	
				{	
					if(ad[i].name.equals(Nname))
					{
						System.out.println(ad[i].getfriend());
						System.out.println("변경할 이름을 입력하시오");
						String nnname=scanner.next();
						ad[i].name=nnname;
						System.out.println(ad[i].getfriend());
					}
					
				}
				
			}
			else if(seno==9)
			{
				run=false;
			}
		}
	}

	private static friend add(String name, int age, int number) {
		// TODO Auto-generated method stub
		return null;
	}

}
