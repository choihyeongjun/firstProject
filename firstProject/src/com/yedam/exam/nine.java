package com.yedam.exam;
import java.util.Scanner;
public class nine {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		int studentnum=0;
		int[]scores= null;
		int max=0;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		
		
		while(run)
		{
			System.out.println("------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료 ");
			System.out.println("------------------------------------");
			System.out.println("<선택>");
			
			int selectNo=scanner.nextInt();
			if(selectNo==1)
			{
				System.out.println("학생수:");
				studentnum=scanner.nextInt();
				scores=new int[studentnum];
			}
			else if(selectNo==2)
			{
				for(int i=0;i<studentnum;i++)
				{
					System.out.printf("scores[%d]",i);
					System.out.println();
					scores[i]=scanner.nextInt();
				}
			}
			
			else if(selectNo==3)
			{
				for(int i=0;i<studentnum;i++)
				{
					System.out.println(scores[i]);
				}
			}
			else if(selectNo==4)
			{
				for(int i=0;i<studentnum;i++)
				{
					if(max<scores[i])
						max=scores[i];
					sum+=scores[i];
					System.out.println("최고점수"+max);
					System.out.println("평균"+sum/studentnum);
					
				}
			}
			else if(selectNo==5)
			{
				run=false;
			}
		}
		System.out.println("프로그램을 종료합니다");
		
	}

}
