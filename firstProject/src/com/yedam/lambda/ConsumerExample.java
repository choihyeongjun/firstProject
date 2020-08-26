package com.yedam.lambda;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer=(t)->{
				System.out.println(t+" 님 반갑습니다.");
				
			};
		consumer.accept("최형준");
		BiConsumer<String,String>biCon=(a,b)->{
			System.out.println(a+"는"+b);
		};
		biCon.accept("고등어", "존나 마싯어 오메가3쿰척쿰척");
		BiConsumer<Integer,Integer>biInt=(a,b)->{
			System.out.println(a+"*"+b+"="+(a*b));
		};
		biInt.accept(24, 5);
	}

}
