package com.yedam.oper;








public class OverflowExample {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);

		int result = safeAdd(-2147483648, -10);
		System.out.println(result);
		
}

	public static int safeAdd(int a, int b) {

		int sum = 0;
		if ((Integer.MAX_VALUE-b) < (a)) {
			System.out.println("유효값 아니데이");
			return 0;
		}
		else if ((a)<(Integer.MIN_VALUE-b))
		{
			System.out.println("유효값이 아닙니다잉");
			return 0;
		}
		else
		{
				sum=a+b;
			return sum;
			}
	}
}
	

