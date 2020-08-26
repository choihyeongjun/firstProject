package com.yedam.classes;
import java.util.*;
public class FriendAddress {
	static Scanner scn=new Scanner(System.in);
	static Friend[] friends=new Friend[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.학교친구 2.회사친구 3.친구 4.리스트 9.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			
			int seno=scn.nextInt();scn.nextLine();
			
			if(seno==1) {
				addUniverFriend();
			}
			else if(seno==2) {
				addComfriend();
			}
			else if(seno==3) {
				addfriend();
			}else if(seno==4) {
				friendList();
			}
			else if(seno==9) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}//end of main
	public static void addfriend() {
		System.out.println("나머지 친구등록.");
		System.out.print("이름입력: ");
		String name=scn.nextLine();
		System.out.print("전화입력: ");
		String phone=scn.nextLine();
		
	
		Friend friend=new Friend();
		 friend.setName(name);
		friend.setPhone(phone);
		
		
		for(int i=0;i<friends.length;i++)
		{
			if(friends[i]==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("입력완료");
	}
	public static void friendList() {
		for(Friend friend: friends) {
			if(friend!=null)
			System.out.println(friend.toString());
		}
	}
	public static void addComfriend() {//회사친구등록 메소드
		System.out.println("회사친구등록.");
		System.out.print("이름입력: ");
		String name=scn.nextLine();
		System.out.print("전화입력: ");
		String phone=scn.nextLine();
		System.out.print("회사이름 입력");
		String comname=scn.nextLine();
		Comfriend friend=new Comfriend();
		 friend.setName(name);
		friend.setPhone(phone);
		friend.setComName(comname);
		
		
		for(int i=0;i<friends.length;i++)
		{
			if(friends[i]==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("입력완료");
	}
	public static void addUniverFriend() {//학교친구등록 메소드.
		System.out.println("학교친구등록.");
		System.out.print("이름입력: ");
		String name=scn.nextLine();
		System.out.print("전화입력: ");
		String phone=scn.nextLine();
		System.out.print("전공입력: ");
		String major=scn.nextLine();
		
		UnivFriend friend=new UnivFriend();
		 friend.setName(name);
		friend.setPhone(phone);
		friend.setMajor(major);
		
		for(int i=0;i<friends.length;i++)
		{
			if(friends[i]==null) {
				friends[i]=friend;
				break;
			}
		}
		System.out.println("입력완료");
	}
}
