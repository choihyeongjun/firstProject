package com.yedam.dev;

public class morningcode11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]ary=new int[5][5];
		int num=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				ary[j][i]=num++;
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(ary[i][j]);
			}
			System.out.println();
		}
	}

}
