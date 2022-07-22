
public class Employee {
	Person P=new Person();
	public double annualSalary; 
	public int joiningYear;
	public String insuranceNumber;
	public String getP() {
		return P.name;
	}
	public void setP(String p) {
		P.name = p;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public void setAll(String name,double annualSalary,int joiningYear,String insuranceNumber) {
		P.name=name;
		this.annualSalary=annualSalary;
		this.insuranceNumber=insuranceNumber;
		this.joiningYear=joiningYear;
	}
	public void getAll() {
		System.out.println(P.name+" "+annualSalary+" "+joiningYear+" "+insuranceNumber);
	}
	
}
