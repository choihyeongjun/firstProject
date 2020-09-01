package com.yedam.test;
import java.util.*;
class Person{
	String name;
	int age;
	Animal an=new Animal();
	Fruit fr=new Fruit();
	
	
	public Person(String name, int age, Animal an, Fruit fr) {
		super();
		this.name = name;
		this.age = age;
		this.an = an;
		this.fr = fr;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", an=" + an + ", fr=" + fr + "]";
	}
	
}
public class LastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] aniarray=new Animal[2];
		Fruit[] fruarray=new Fruit[2];
		Person[] perarray=new Person[2];
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("애완동물");
			String name=scn.next();
			int age=scn.nextInt();
			String sex=scn.next();
			Animal ani=new Animal(name,age,sex);
			aniarray[i]=ani;
		}
		for(int i=0;i<2;i++) {
			System.out.println("과일");
			String name=scn.next();
			int price=scn.nextInt();
			Fruit fr=new Fruit(name,price);
			fruarray[i]=fr;
		}
		Person[] personData=new Person[3];
		for(int i=0;i<2;i++) {
			System.out.println("사람입력");
			String name=scn.next();
			int age=scn.nextInt();
			Person p1=new Person(name,age,aniarray[i],fruarray[i]);
			personData[i]=p1;
			System.out.println(personData[i]);
		}
		
	}

}
