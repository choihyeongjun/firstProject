package com.yedam.dev;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytevalue=10;
		char charvalue='A';
		short shortvalue=(short)charvalue;
		double doublevalue=bytevalue;
		boolean run=false;
		int var1=0;
		
		++var1;
		for(int i=0;i<3;i++) {
			run=!run;
		if(run)
			var1++;
		}
		System.out.print(var1);
	}

}
