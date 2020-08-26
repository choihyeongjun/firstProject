package collection;
import java.util.*;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>scores=new TreeMap<>();
		scores.put(new Integer(87),"최재영");
		scores.put(new Integer(98),"최형준 틀림없지");
		scores.put(new Integer(75),"김상민");
		scores.put(new Integer(95),"문선애");
		scores.put(new Integer(80),"허성준");
		
		Map.Entry<Integer,String>entry=scores.firstEntry();
		entry=scores.lastEntry();
		System.out.println("점수: "+entry.getKey()+", "
									+ "이름: "+entry.getValue());
		Integer icnt=scores.firstKey();
		//scores.get(icnt);
		System.out.println("점수: "+icnt+", "
									+ "이름: "+scores.get(icnt));
		
		Map.Entry<Integer,String>pEntry=scores.pollFirstEntry();
		
	}

}
