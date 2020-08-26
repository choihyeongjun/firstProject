package com.yedam.api;
import java.util.*;


class User implements Comparable<User>{
	String name;
	int grade;
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return o.grade-this.grade;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", grade=" + grade + "]";
	}
	

	
	
	
	
}

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Hong","Park","Choi"};
		Arrays.sort(names);
		for (String s:names) {
			
			System.out.println(s);
		
		}
		User[] users= {new User("user1",1),new User("user2",2),new User("user3",3)};
		
		Arrays.sort(users);
		for(int i=0;i<users.length;i++) {
			System.out.println(users[i]);
		}
		for(User s:users) {
			System.out.println(s);
		}
	}

}
