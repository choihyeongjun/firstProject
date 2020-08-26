package generic;
import com.yedam.classes.person;
public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Box box=new Box(); String st1=new String("Hello"); box.set(st1); String
		 * result=(String) box.get(); System.out.println(box.get()); person p1=new
		 * person(); box.set(p1); person p2=(person) box.get();
		 * result=(String)box.get();
		 */
		Box<String> box=new Box<>();
		box.set(new String("hello"));
		String result=box.get();
		System.out.println(result);
		Box<person> box2=new Box<>();
		box2.set(new person());
		person p1=box2.get();
		System.out.println(p1);
		
		Box<person>box3=Utils.boxing(new person());
		Box<String> box4=Utils.boxing(new String("hhh"));
		
	}

}
