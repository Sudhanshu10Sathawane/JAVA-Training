class AgeException extends Exception{
	public AgeException(String str){
		super(str);
	}
}
public class NameAge {
	String name;
	int age;
	static void validate(int age) throws AgeException{
		if(age>=18 && age<60) {
			System.out.println("Your data has been submitted Successfully");
		}
		else {
			throw new AgeException("Error in Age");
			}
	}
	public static void main(String[] args) {
		NameAge A= new NameAge();
		try {
		String h=args[0];
		A.name=h;
		String k=args[1];
		int a=Integer.parseInt(k); 
		validate(a);
		A.age=a;
		}
		catch(AgeException ae) {
			System.out.println(ae.toString());
		}

	}

}
