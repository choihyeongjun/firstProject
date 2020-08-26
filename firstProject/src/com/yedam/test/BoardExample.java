package com.yedam.test;
import java.util.*;

import collection.Student;

public class BoardExample {
	static int index=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		List<Board>list=new ArrayList<>();
		boolean run=true;
		Board bd=new Board();
		while(run) {
			System.out.println("1.게시글 작성2.게시글 수정 3. 게시글 삭제 4.전체글 보기");
			System.out.println("번호를 입력하시오");
			
		int seno=scn.nextInt();
		if(seno==1) {
			System.out.println("제목");
			String using=scn.next();//제목
			System.out.println("내용 입력");
			String use=scn.next();//내용
			scn.nextLine();
			System.out.println("작성자");
			String user=scn.next();
			scn.nextLine();
			
		
			Board st=new Board(index,using,use,user);
			bd=st;
			list.add(st);
			index++;
			
		}
		else if(seno==2) {
			System.out.println("게시글 번호 선택");
			int select2=scn.nextInt();
			System.out.println(list.get(select2+1).toString());
			System.out.println("1.제목 수정 2.내용수정");
			int select=scn.nextInt();
			if(select==1)
			{
				String using=scn.next();
				bd.setUsing(using);
				list.set(select2+1,bd);
			}
			else if(select==2) {
				String using=scn.next();
				bd.setUsing2(using);
				list.set(select2+1,bd);
			}
			
		}
		else if(seno==3) {
			System.out.println("어떤 게시물을 삭제하시겟나");
			int select=scn.nextInt();
			list.remove(select);
			System.out.println("삭제완료");
		}
		else if(seno==4) {
			System.out.println("게시글번호 ||  제목    || 작성자");
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getIndex()+"      "+list.get(i).getUsing()+list.get(i).getUser());
			}
		}
			}
	}

}
