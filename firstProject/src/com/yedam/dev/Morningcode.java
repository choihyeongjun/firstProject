package com.yedam.dev;
import java.util.*;

public class Morningcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []randomnum=new int[10];
		randomnum=(int)(1+Math.random()*100);
		System.out.println(randomnum);
		for(int i=0;i<10;i++)
		{
			
			System.out.print(randomnum+" ");
		}
	}

}
