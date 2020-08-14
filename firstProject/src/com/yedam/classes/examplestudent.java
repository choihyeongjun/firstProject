package com.yedam.classes;

public class examplestudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setstudent(111,"홍길동","역사");
		Student st1=new Student();
		st1.setstudent(222,"김유신" , "역사");
		
		Student st2[]= {st,st1};
		//for(int i=0;i<st2.length;i++)
		//System.out.println(st2[i].getstudent());
		String searchName="김유신";
		
		for(int i=0;i<st2.length;i++)
		{
			if((st2[i].name.equals(searchName)))
			{
				System.out.println(st2[i].getstudent());
			}
		}
	}

}
