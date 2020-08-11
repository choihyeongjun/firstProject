package com.yedam.dev;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			b++;
			sum+=b;
			
			System.out.println("i:"+i+" "+"b:"+b+" "+"sum:"+sum);
			
		}
		System.out.print(sum);
	}

}
