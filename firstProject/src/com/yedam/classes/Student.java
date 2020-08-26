package com.yedam.classes;

public class Student {
	int stnum;
	String name;
	String major;
	public Student()
	{
		stnum=2151111;
		name="김아무개";
		major="비전공자";
	}
	public int getName()
	{
		this.name;
	}
	public Student(int stnum)
	{
		this.stnum=stnum;
	}
	public Student(int stnum,String name)
	{
		this.stnum=stnum;
		this.name=name;
	}
	public void setstudent(int stnum,String name,String major)
	{
		this.stnum=stnum;
		this.name=name;
		this.major=major;
	}
	public String getstudent()
	{
		return stnum+" "+name+" "+major; 
	}
	
	
	
}
