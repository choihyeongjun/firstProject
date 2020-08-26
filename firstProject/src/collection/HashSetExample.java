package collection;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set=new HashSet<>();
		set.add(new Member("김다희",30));
		set.add(new Member("문선애",28));
		set.add(new Member("문선애",22));
		for(Member mem:set)
		System.out.println(mem.getName()+", "+mem.getAge());
		
	}

}
