public class Patient {
	String patientName;
	double height;
	double weight;
	double computeBMI() {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		Patient P1=new Patient();
		Patient P2=new Patient();
		P1.patientName="Kamlesh";
		P1.height=5.4;
		P1.weight=65;
		P2.patientName="Rajesh";
		P2.height=5.8;
		P2.weight=70;
		System.out.println("Patient Name : "+P1.patientName+" BMI : "+P1.computeBMI());
		System.out.println("Patient Name : "+P2.patientName+" BMI : "+P2.computeBMI());
	}
}
