public class MainTest {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(1, "Kamlesh", "Kamlesh@gl.com", 'M', 25000);
		Employee emp2 = new Employee(2, "Suri", "Suri@gl.com", 'F', 30000);
		Employee emp3 = new Employee(3, "Kapil", "Kapil@gl.com", 'M', 20000);
		Employee emp4 = new Employee(4, "Manoj", "Manoj@gl.com", 'M', 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(2);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(3));
	}

}