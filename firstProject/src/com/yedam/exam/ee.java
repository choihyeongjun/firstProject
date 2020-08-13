package com.yedam.exam;
import java.util.*;
public class ee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int[] ary=new int[3];
		
		int temp=0;
		
		for(int i=0;i<3;i++)
		{
			ary[i]=d.nextInt();
		}
		 
		
		int min=0;
		for(int j=0;j<2;j++)
		{
			min=j;
		for(int i=1;i<3;i++)
		{
			if(ary[min]>ary[i])
			{
				min=i;
			}	
		}
		        temp=ary[j];
				ary[j]=ary[min];
				ary[min]=temp;
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(ary[i]);
		}
	}

}
