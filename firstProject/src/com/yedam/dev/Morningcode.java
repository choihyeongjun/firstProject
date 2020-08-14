package com.yedam.dev;


public class Morningcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []randomnum=new int[10];
		int ran=(int)(Math.random()*10+1);
		System.out.println(ran);
		//System.out.println(randomnum);
		for(int i=0;i<10;i++)
		{
			randomnum[i]=(int)(Math.random()*10+1);
			//System.out.print(randomnum+" ");
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(randomnum[i]+" ");//i안붙여주면 주소값나옴 조심하자
		}
	}

}
