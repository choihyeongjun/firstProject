package com.yedam.classes;

public class person {
	String name;
	int age;
	public person()//초기값 선언
	{
		name="anonymous";
		age=10;
	}
	public person(String name)
	{
		this.name=name;
	}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String introduce()
	{
		return "이름은 "+name+"나이는 "+age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
