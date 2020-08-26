package List;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tSet=new TreeSet<>();
		tSet.add(new Integer(87));
		tSet.add(new Integer(98));
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		Integer t=tSet.first();
		t=tSet.last();
		t=tSet.floor(new Integer(87));//<=
		
		t=tSet.lower(new Integer(87));//<
	
		t=tSet.ceiling(new Integer(80));//>=
		
		t=tSet.higher(new Integer(85));//>
		Iterator<Integer> diter=tSet.descendingIterator();
		while(diter.hasNext()) {
			System.out.println(diter.next());
			
		}
		System.out.println("------------------");
		NavigableSet<Integer>nSet=tSet.descendingSet();
		for(Integer icnt :nSet) {
			System.out.println(icnt);
		}
		
		int size=tSet.size();
		//System.out.println(t);
		for(int i=0;i<size;i++) {
		t=tSet.pollFirst();
		System.out.println(t+", "+tSet.size());}
		
		Iterator<Integer>iter=tSet.iterator();
		while(iter.hasNext()) {
			 Integer icnt = iter.next();
			 //System.out.println(icnt);
		}
		
	}

}
