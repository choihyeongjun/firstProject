package com.yedam.classes.exam;

public class MemberSeriveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] members=new Member[3];
		
			members[0]=new Member("홍길동","hong");
			members[0].setPassword("12345");;
			members[1]=new Member("김유신","kim");
			members[1].setPassword("kim123");;
			members[2]=new Member("최재영","choi");
			members[2].setPassword("choi123");
		
		Member mem1=new Member("hong", "12345");
		mem1.setPassword("12345");
		for(int i=0;i<members.length;i++)
		{
			
			MemberService memberservice =new MemberService();
			boolean result=memberservice.login(members[i].getId(),members[i].getPassword(),members);	
			System.out.println(members[i].getId()+members[i].getPassword());
			if(result)
			{
				System.out.println("로그인 되었습니다");
				memberservice.logout("hong");
			}
			else
			{
				System.out.println("id또는 password가 올바르지 않습니다");
			}
			
		}
	}

}
