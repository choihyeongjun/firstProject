package collection;
import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("허성준");
		list.add("김시무");
		list.add(1,"이광호");
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
		
		for(String str:list) {
			System.out.println(str);
		}
	}
}
