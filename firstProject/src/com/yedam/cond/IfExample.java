package com.yedam.cond;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int score=90; String grade=""; if(score>=90) { grade="A"; if(score>=95)
		 * grade="A+";
		 * 
		 * } else if(score>=80) grade="B";
		 * 
		 * System.out.println(grade);
		 */
		
		
		  for (int i = 0; i <= 5; i++)
		  { 
			  for (int j = 0; j <= 5; j++) 
			  {
				  System.out.print(i + "" + j + " "); 
		  } 
			  System.out.print("\n");
		}
		  
		  for(int i=1;i<10;i++)
		  {
			  for(int j=1;j<10;j++)
			  {
				  System.out.println(i+"*"+j+"="+i*j);
			  }
			  
			  System.out.println("  ");
		  }
		  
		 
	}

}
