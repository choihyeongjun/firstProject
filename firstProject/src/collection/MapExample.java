package collection;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Member>map=new HashMap<>();
		map.put(11, new Member("김현동",20));
		map.put(12, new Member("박진구",21));
		map.put(13,new Member("오재훈",22));
		System.out.println(map.get(11).getName()+", "+map.get(11).getAge());
		Set<Integer>set=map.keySet();
		for(Integer i:set) {
			Member m=map.get(i);
			System.out.println(m.getName()+", "+m.getAge());
		}
		
		Set<Map.Entry<Integer, Member>>entset=map.entrySet();
		for(Map.Entry<Integer,Member>m:entset) {
			System.out.println(m.getKey()+", "+m.getValue().getName());
		}
		Map<String,String> m=new HashMap<>();
		m.put("이름","형준");
		m.put("전공","정통");
		getInfo(m);
		
		Map<String,Integer>m2=new HashMap<>();
		m2.put("최형준",20);
		m2.put("문선애",21);
		m2.put("이광호",22);
		Set<Map.Entry<String, Integer>>e=m2.entrySet();
	
		
		getAge(m2);
	}
	
	public static void getAge(Map<String,Integer>m3) {
		Set<Map.Entry<String, Integer>>e=m3.entrySet();
		for(Map.Entry<String, Integer>m2:e) {
			System.out.println(m2.getKey()+", "+m2.getValue());
		}
	}
	public static void getInfo(Map<String, String>m) {
		System.out.println("이름: "+m.get("이름"));
		System.out.println("전공: "+m.get("전공"));
	}

}
