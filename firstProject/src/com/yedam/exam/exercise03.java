package com.yedam.exam;

public class exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		
		while(true)
		{
			int i=(int)(Math.random()*6+1);
			int j=(int)(Math.random()*6+1);
			if(i+j==5)
			{
				System.out.println(i+" "+j+"나왓당");
				break;
			}
			System.out.println(i+" "+j);
			
		}
	}
	
	

}
