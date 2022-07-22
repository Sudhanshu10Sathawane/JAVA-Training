
public class TestEmployee{
	public static void main(String[] args) {
		Employee E1=new Employee();
		Employee E2=new Employee();
		E1.setP("Rakesh");
		E1.setAnnualSalary(240000.0);
		E1.setJoiningYear(2015);
		E1.setInsuranceNumber("LIC3563");
		E2.setAll("Himanshu", 250000, 2011, "LIC783687");
		System.out.println(E1.getP()+" "+E1.getAnnualSalary()+" "+E1.getJoiningYear()+" "+E1.getInsuranceNumber());
		E2.getAll();
	}
}
