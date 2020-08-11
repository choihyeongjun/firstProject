package com.yedam.dev;

public class CharExample {

	public static void main(String[] args) {
		char c1=44032;//65에 해당되는값
		//for (int i=0;i<26;i++)
		//System.out.print(c1++ + "\t");
		
		
		char c2='A';
		System.out.println((int)c2);
		
		for(int i=0;i<10;i++)
		{
			if(i<5)
			{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++)
			{
				System.out.print("*");
			}
			for(int j=4;j>i;j--)
				System.out.print(" ");
			System.out.print("\n");
			}
			else
			{
				for(int l=0;l<i-4;l++)
				{
					System.out.print(" ");
				}
				for(int k=12;k>i*2-5;k--)
				{
					System.out.print("*");
				}
			
				System.out.print("\n");	
			}
			
		}
	}

}
