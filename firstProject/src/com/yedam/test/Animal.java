package com.yedam.test;

public class Animal {
	String name;
	int age;
	String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Animal(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Animal() {
		
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
