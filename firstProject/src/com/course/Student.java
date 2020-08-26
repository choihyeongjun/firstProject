package com.course;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	public Student(String name,int age,int score) {
		this.age=age;
		this.name=name;
		this.score=score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age-o.age;//음수 (오름차순)
		//return o.age-this.age;//(내림차순)
	}
	@Override
	public String toString() {
		return " name=" + name + ", age=" + age + ", score=" + score + "";
	}
	
	
}
