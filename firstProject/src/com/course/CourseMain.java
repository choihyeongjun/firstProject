package com.course;
import java.util.*;
import java.util.Map.Entry;
public class CourseMain {
	static int count=0;
	static int count1=0;
	static int count2=0;
	static Course c=new Course();
	public static void showCourseInfo(){
		System.out.println("전체 과정 및 수강사람들");
		System.out.println(c.getInfo()+"인원수"+c.getInfo().size());
		System.out.println("자바 사람들");
		for(Entry<Student, String> entry:c.einfo.entrySet()) {
			if(entry.getValue().equals("자바"))
			System.out.println(entry.getKey()+entry.getValue());
		}
		System.out.println("오라클 사람들");
		for(Entry<Student, String> entry:c.einfo.entrySet()) {
			if(entry.getValue().equals("오라클"))
			System.out.println(entry.getKey()+entry.getValue());
		}
			System.out.println("파이썬 사람들");
			for(Entry<Student, String> entry:c.einfo.entrySet()) {
				if(entry.getValue().equals("파이썬"))
				System.out.println(entry.getKey()+entry.getValue());
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		Scanner scn=new Scanner(System.in);
		while(run) {
			System.out.println("과정입력하시오");
			System.out.println("1.자바 2.오라클,3파이썬 9.입력 완료");
			int seno=scn.nextInt();
			if(seno==1) {//java과정
				System.out.println("이름:");
				String name=scn.next();
				System.out.println("나이:");
				int age=scn.nextInt();
				System.out.println("성적:");
				int score=scn.nextInt();
				Student st=new Student(name,age,score);
				c.addCourse(st,"자바");
				count++;
				if(count==5) {
					System.out.println("수강인원이 가득찼습니다");
					continue;
					}
			}
			else if(seno==2) {
				System.out.println("이름:");
				String name=scn.next();
				System.out.println("나이:");
				int age=scn.nextInt();
				System.out.println("성적:");
				int score=scn.nextInt();
				Student st=new Student(name,age,score);
				c.addCourse(st,"오라클");
				count1++;
				if(count1==5) {
					System.out.println("수강인원이 가득찼습니다");
					continue;
					}
			}
			else if(seno==3) {
				System.out.println("이름:");
				String name=scn.next();
				System.out.println("나이:");
				int age=scn.nextInt();
				System.out.println("성적:");
				int score=scn.nextInt();
				Student st=new Student(name,age,score);
				c.addCourse(st,"파이썬");
				count2++;
				if(count2==5) {
					System.out.println("수강인원이 가득찼습니다");
					continue;
					}
			}
			else if(seno==9) {
				run=false;
			}
		}
		showCourseInfo();
	}



}
