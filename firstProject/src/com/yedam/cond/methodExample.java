package com.yedam.cond;

public class methodExample {
   public static void multTable(int a,int b)
   {
	   for(int i=a;i<=b;i++)
	   {
		   for(int j=1;j<10;j++)
			   System.out.println(i+"*"+j+"="+i*j);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multTable(3,5);
	}

}
