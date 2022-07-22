import java.util.*;
public class TreeSetOpera {

	public static void main(String[] args) {
		TreeSet<String> T=new TreeSet<>();
		T.add("January");
		T.add("Februray");
		T.add("March");
		T.add("April");
		T.add("May");
		T.add("June");
		T.add("July");
		T.add("August");
		T.add("September");
		T.add("October");
		T.add("November");
		T.add("December");
		System.out.println(T);
		System.out.println("Reverse : "+T.descendingSet());
		Iterator<String> it=T.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
	}
	
}
