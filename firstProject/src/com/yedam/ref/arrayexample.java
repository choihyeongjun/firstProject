package com.yedam.ref;

public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intary= {2,4,5,3,5};
		int result=addAry(new int[]{2,3,4});
		System.out.println("배열합"+result);
	}

	private static int addAry(int[] ary) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=0;i<ary.length;i++)
			sum+=ary[i];
		return sum;
	}

}
