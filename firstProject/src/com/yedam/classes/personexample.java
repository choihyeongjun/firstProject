package com.yedam.classes;

public class personexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		p1.setName("최형준");
		p1.setAge(25);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		person chj=new person();
		chj.setName("김상민");
		chj.setAge(27);
		System.out.println(chj);
		person ksm=new person();
		ksm.setAge(28);
		ksm.setName("누꼬");
		person[] pAry= {chj};
		System.out.println(pAry[0].introduce());
		person per=new person();
		System.out.println(per.introduce());
		
		
		
	}

}
