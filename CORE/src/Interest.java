import java.util.Scanner;
public class Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="Male";
		System.out.println("Enter Gender : ");
		String gender=sc.next();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		if(gender.equalsIgnoreCase(s1)) {
			if(age>=1 && age<58) {
				System.out.println("8.4%");
			}
			else if(age<=100) {
				System.out.println("10.5%");
			}
		}
		else {
			if(age>=1 && age<58) {
				System.out.println("8.2%");
			}
			else if(age<=100) {
				System.out.println("9.2%");
			}
		}
	}
}
