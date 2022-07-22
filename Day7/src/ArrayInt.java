import java.util.*;
class MyArrayList<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
public class ArrayInt {

	public static void main(String[] args) {
		List<Object> num = new MyArrayList<>();
		try {
		num.add(1);
		num.add(1.5);
		num.add(67);
		num.add(4578);
		num.add(1.78);
		num.add(-1);
		num.add("hello");
		}
		catch(ClassCastException cce) {
			System.out.println(cce.toString());
		}
		System.out.println(num);
	}

}
