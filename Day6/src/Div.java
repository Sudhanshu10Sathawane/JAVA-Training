import java.util.*;
public class Div {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int num=sc.nextInt();
			int den=sc.nextInt();
			int que=num/den;
			System.out.println("ans: "+que);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}

	}

}
