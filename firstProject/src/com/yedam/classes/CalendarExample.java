package com.yedam.classes;

import java.util.Calendar;
import java.util.*;
public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.set(2020,2,1);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));//0부터 시작해서 7이라뜸 8월의미
		System.out.println(cal.get(Calendar.DATE));
		createCalendar();
	}
	public static void createCalendar() {
		Calendar cal=Calendar.getInstance();
		System.out.println("월을 입력하시오");
		Scanner scn=new Scanner(System.in);
		int month=scn.nextInt();
		cal.set(2020,month-1,1);
		
		int b=0;
		if((month)==1||(month)==3||(month)==5||(month)==7||(month)==8||(month)==10||(month)==12)
			b=31;
		else if((month)==2)
			b=29;
		else
			b=30;
		//System.out.println("월시작 공백갯수");
		//System.out.println(cal.get(Calendar.));
		//int blank=scn.nextInt();
		//System.out.println(b);
		System.out.println("   일   월  화   수   목   금   토");
		for(int j=1;j<cal.get(Calendar.DAY_OF_WEEK);j++)
		{
			System.out.print("   ");
		}
		for(int i=1;i<=b;i++) {
			System.out.printf("%3d",i);
			if((cal.get(Calendar.DAY_OF_WEEK)-1+i)%7==0)
				System.out.println();
		}
	}
}
