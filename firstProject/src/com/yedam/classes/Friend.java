package com.yedam.classes;

public class Friend {
	private String name;
	private int age;
	private String phone;
	
	public Friend(String name,int age,String phone)
	{
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
	public String getName()   
	{
		return name;
	}
	public String phoneName()
	{
		return phone;
	}
	public int age(int age)
	{
		return age;
	}
	public Friend()
	{
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "일반친구 이름: "+this.getName()+", 연락처: "+this.phoneName();
	}
	
}
