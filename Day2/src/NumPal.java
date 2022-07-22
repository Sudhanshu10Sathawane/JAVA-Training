import java.util.Scanner;
public class NumPal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int or=num;
		int revNum=0;
		while(num!=0) {
			int digit=num%10;
			revNum=revNum*10+digit;
			num/=10;
		}
		if(or==revNum) {
			System.out.println(or+" Is a Palindrome");
		}
		else {
			System.out.println(or+" Is Not a Palindrome");
		}
	}
}
