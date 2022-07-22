import java.util.*;
public class EmployeeHash {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Kamlesh");
		set.add("Ravi");
		set.add("You");
		set.add("Me");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}