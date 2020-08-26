package com.yedam.classes.statics;
import java.util.*;
public class BankApplication {
	static int i=0;
	private static Account[] accountArray=new Account[100];
	private static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		
		while(run)
		{
			System.out.println("------------------------------------");
			System.out.println("1.계좌 생성  2.계좌목록  3.예금  4.출금  5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			int seno=scn.nextInt();
			
			if(seno==1)
			{	System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				
				createAccount();
			
				
				System.out.println("계좌가 생성되었습니다");
				
				
			}
			else if(seno==2)
			{
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				accountList();
			}
			else if(seno==3)
			{
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				deposit();
			}
			else if(seno==4)
			{
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				withdraw();
			}
			else if(seno==5)
			{
				run=false;
			}
		
		}
		System.out.println("프로그램 종료");
		
	
		
	}
	private static void accountList()
	{
		for(int i=0;i<accountArray.length;i++)
		{
			if(accountArray[i]!=null)
			{
				System.out.print(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
				System.out.println();
				
			}
			
		}
	}
	private static void withdraw() {
		// TODO Auto-generated method stub
		
			
			System.out.print("계좌번호 입력");
			String draw=scn.next();
			System.out.print("출금액: ");
			int money=scn.nextInt();
			Account ad=findAccount(draw);
				if(ad.getBalance()>=money)
				{
					ad.setBalance(ad.getBalance()-money);
					System.out.println("출금이 성공되었습니다");
				}
			
			
		
	}
	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("계좌번호: ");
		String ano1=scn.next();
		 
			Account ad=findAccount(ano1);
				System.out.print("예금액: ");
				int money=scn.nextInt();
				ad.setBalance(ad.getBalance()+money);
			
		
	}
	private static Account findAccount(String ano)
	{
		Account m=null;
		for(int i=0;i<accountArray.length;i++)
		{
			
			if(accountArray[i]!=null)
			{
			if(accountArray[i].getAno().equals(ano))
			{
				m=accountArray[i];
			}
				
					
				
			}
			
		}
		return m;	
		
	}
	private static void createAccount() {
		// TODO Auto-generated method stub
		
		
		System.out.print("계좌번호:");
		String ano1=scn.next();
		System.out.print("계좌주:");
		String owner1=scn.next();
		System.out.print("초기입금금액:");
		int balance1=scn.nextInt();
		Account ad=new Account(ano1,owner1,balance1);
		accountArray[i]=ad;
		i++;
	}

}
