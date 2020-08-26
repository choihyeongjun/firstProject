package com.yedam.lambda;
import java.util.*;
import java.util.function.*;
public class FunctionExample {
	public static void main(String[] args) {
		Function<String,String> func1=(str) ->{
			return str+ " is nothing";
		};
		String result=func1.apply("something");
		System.out.println(result);
		
		Function<String,Integer>func2=(str)->{//<입력형식,출력형식>
			return str.length();
		};
		int len=func2.apply("Hello");
		System.out.println(len);
	}
}
