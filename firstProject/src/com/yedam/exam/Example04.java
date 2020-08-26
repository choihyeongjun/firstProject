package com.yedam.exam;
import java.util.*;
public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intAry=new int[3];
		for(int i=0;i<intAry.length;i++) {
			int ran=(int)(Math.random()*6+1);
			for(int j=0;j<intAry.length;j++) {
				if(intAry[j]==ran)
				{
					i--;
					break;
				}
				else
				intAry[i]=ran;
				
			}
					
				
		}
		for(int j=0;j<intAry.length;j++)
			System.out.println(intAry[j]);
	}

}
