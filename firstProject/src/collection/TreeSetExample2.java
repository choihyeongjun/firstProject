package collection;

import java.util.*;
public class TreeSetExample2 {

	public static void main(String[] args) {
		//TreeSet<E>uto-generated method stub
		TreeSet<PerSon>set=new TreeSet<>();
		set.add(new PerSon("Hong1",10));
		set.add(new PerSon("Hong2",14));
		set.add(new PerSon("Hong3",12));
		set.add(new PerSon("Hong4",11));
		Iterator<PerSon>iter=set.iterator();
		SortedSet<PerSon>sSet=set.headSet(new PerSon("sorted",12));
		sSet=set.tailSet(new PerSon("So",12));
		sSet=set.subSet(new PerSon("Temp",10),new PerSon("Temp2",12));
		for(PerSon person:sSet) {
			System.out.println(person.name+", "+person.age);
		}
		System.out.println("---------------------------------");
		NavigableSet<PerSon>nSet=set.headSet(new PerSon("sorted",12),true);
		set.subSet(new PerSon("SSS",10),true,new PerSon("TTT",12),true);
		for(PerSon person:nSet) {
			System.out.println(person.name+", "+person.age);
		}
		while(iter.hasNext()) {
			System.out.println(iter.next().name);
		}
	}

}
