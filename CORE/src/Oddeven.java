import java.util.Scanner;
public class Oddeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}
}
