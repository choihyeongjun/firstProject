package collection;

public class PerSon implements Comparable<PerSon> {
	String name;
	int age;
	public PerSon(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(PerSon o) {
		// TODO Auto-generated method stub
		return this.age-o.age;//음수 (오름차순)
		//return o.age-this.age;//(내림차순)
	}
	
}
