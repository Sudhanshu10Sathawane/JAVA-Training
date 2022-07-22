import java.util.*;
class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	public String toString() {
		return "Employee: id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary ;
	}
}

public class VectorEmployee {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Kamlesh", "Bhopal, India", 20000.0));
		list.add(new Employee(102, "Ravi", "Delhi, India", 30000.0));
		list.add(new Employee(103, "Deepak", "Kanpur, India", 25000.0));
		list.add(new Employee(104, "Jagu", "Kashmir, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		int searchId = 102;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}