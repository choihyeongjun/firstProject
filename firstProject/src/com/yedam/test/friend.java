package com.yedam.test;

public class friend{
	String name;
	int age;
	int number;
	
	public friend()
	{
		name="최형준";
		age=25;
		number=010444;
	}
	public friend(String name,int age,int number)
	{
		this.name=name;
		this.age=age;
		this.number=number;
	}
	public void getname()
	{
		name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setnum(int number)
	{
		this.number=number;
	}
	public void setfriend(String name,int age,int number)
	{
		this.name=name;
		this.age=age;
		this.number=number;
	}
	public String getfriend()
	{
		return name+" "+age+" "+number;
	}
}
