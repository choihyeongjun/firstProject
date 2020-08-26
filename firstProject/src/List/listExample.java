package List;
import java.util.*;
public class listExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>aList=new ArrayList<>();
		long startTime=System.nanoTime();
		for(int i=0;i<30000;i++) {
			aList.add(0,new Integer(i));
		}
		long endTime=System.nanoTime();
		System.out.println("걸린시간: "+(endTime-startTime));
		List<Integer>bList=new ArrayList<>();
		startTime=System.nanoTime();
		for(int i=0;i<30000;i++) {
			bList.add(0,new Integer(i));
		}
		endTime=System.nanoTime();
		System.out.println("linkedlist걸린시간"+(endTime-startTime));
		
		Set<Person> pSet=new HashSet<>();
		pSet.add(new Person("Hong1",20));
		pSet.add(new Person("Hong2",21));
		pSet.add(new Person("Hong1",20));
		for(Person p:pSet) {
			System.out.println(p.name+","+p.age);
		}
		
	}

}
