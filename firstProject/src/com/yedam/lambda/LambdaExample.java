package com.yedam.lambda;
//함수적 인터페이스
interface MyFunctionalInterface {
	public void run(); 
	
}
class MyFuncClass implements MyFunctionalInterface{
	public void run() {
		System.out.println("유베럴 런~런~런~런~런런 ~~");
	}
}
public class LambdaExample{
	public static void main(String[] args) {
		MyFunctionalInterface myintf=()->
			{
				System.out.println("runnnn");
			};
		myintf.run();
		ShowContent sc= (content)-> {
				System.out.println("내용은 "+content+" 입니다");
			};
		sc.show("바나나");
		ShowContent sc2=(content)-> {System.out.println("this is "+content);};
		sc2.show("빠나나");
		
		Calculate cal =	(a,b)-> a+b;
		System.out.println(cal.sum(10, 5));
		
	}
}
