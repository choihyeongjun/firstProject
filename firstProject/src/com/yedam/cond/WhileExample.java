package com.yedam.cond;



public class WhileExample {

	public static int hi(int a,int b)
	{
		int i=1;
		int j=1;
		while(i<10)
		{
			if(i<a||i>b)
			{
				i++;
				continue;
			}
			else {
			System.out.println(i+"*"+j+"="+i*j);
			j++;
			
			if (j==10)
			{
			   
				j=1;
				i++;
			}
		}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=1;
		hi(2,7);
		while(i<10)
		{
			
			System.out.println(i+"*"+j+"="+i*j);
			j++;
			
			if (j==10)
			{
				j=1;
				i++;
			}
		}
	}

}
