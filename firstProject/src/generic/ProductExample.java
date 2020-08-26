package generic;

import com.yedam.classes.person;


public class ProductExample {
	public static void main(String[] args) {
		
		Product<String, person> pr1 =new Product<String, person>();
		pr1.setModel(new person());
		pr1.setType("hello");
		
		Product<String ,Integer>p1=new Product<>();
		p1.setModel(10);
		p1.setType("선애누나 그래서 8월은 몇일까지잇다고??");
		Product<String,Integer>p2=new Product<>();
		p2.setModel(10);
		p2.setType("선애누나 그래서 8월은 몇일까지잇다고??");
				boolean tof =Utils.compare(p1,p2);
				if(tof)
					System.out.println("논리적동등");
				else
					System.out.println("논리적으로 다름");
	}

}
