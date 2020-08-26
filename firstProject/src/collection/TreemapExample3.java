package collection;
import java.util.*;
public class TreemapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student,String> tMap=new TreeMap<>();
		tMap.put(new Student("Hong",69,79),"체육특기(스미마)생");
		tMap.put(new Student("Park",78,88),"일반학(스미마)생");
		tMap.put(new Student("Choi",85,79),"체육특기(스미마)생");
		tMap.put(new Student("Kim",90,86),"일반학(스미마)생");
		
		System.out.println(tMap.headMap(new Student("SO",80,0)));//80점이하
		System.out.println(tMap.tailMap(new Student("SOrt",80,0)));//80점이상
		System.out.println(tMap.subMap(new Student("SORT",70,0),
				new Student("SORT",80,0)));//70에서 80사이
		SortedMap<Student,String>sMap=tMap.headMap(new Student("SO",80,0));
		Set<Student>set=sMap.keySet();
		for(Student s:set) {
			System.out.println(s.getName()+", "+s.getMathScore()+","
		+tMap.get(s));
		}
	}

}
