import java.util.*;
public class NameIterator {

	public static void main(String[] args) {
		ArrayList<String> Names =new ArrayList<>();
		Names.add("Vikas");
		Names.add("Mukesh");
		Names.add("Kamlesh");
		Iterator<String> it=Names.iterator();
		while(it.hasNext()) {

		     Object x=it.next(); 

		 System.out.println("Name " +x);

		    }
	}

}
