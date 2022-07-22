import java.util.Scanner;
public class SLS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String h=sc.next();
		int n1=s.length();
		int n2=h.length();
		if(n1<n2) {
			System.out.println(s+h+s);
		}
		else {
			System.out.println(h+s+h);
		}
		}
}
