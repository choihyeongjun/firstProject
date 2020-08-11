package com.yedam.dev;

public class operatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int result3;
	
		// int result=3+8-5*4;
		//int result1=3+(8-5)*4+result++;
		//int result2=3+(8-5)*4+(result++);
		//System.out.println(result);
		//System.out.println(result);
		//System.out.println(result2);
		
		
		
		for(int i=0;i<5;i++)
		{
			
			for(int k=5-1;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		
	}

}
