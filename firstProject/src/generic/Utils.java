package generic;

public class Utils {
	public static <T> Box<T> boxing(T t) {
		Box<T> box=new Box<>();
		box.set(t);
		return box;
	}
	public static <T,V> V getValue(,V v) {
		Container<T,V> c=new Container<>(t,v);
		c.set(t, v);
		return c.getValue();
	}
	public static <T,V> V pair(Container<T,V>c1, Container<T,V>c2) {
		boolean b1=c1.getKey().equals(c2.getKey());
		if (b1==true)
			return c1.getValue();
		else
			return null;
	}
	public static<T,M> boolean compare(Product<T,M>p1,Product<T,M>p2) {
		boolean b1=p1.getType().equals(p2.getType());
		boolean b2=p1.getModel().equals(p2.getModel());
		
		return b1&&b2;
	}
}
