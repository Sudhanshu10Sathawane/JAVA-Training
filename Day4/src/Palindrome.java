import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=s.length();
	int flag=0;
	for(int i=0;i<n;i++) {
		if(s.charAt(i)!=s.charAt(n-1-i)) {
			System.out.println("Not a Palindrome");
			flag=1;
			break;
		}
	}
	if(flag!=1) {
		System.out.println("Palindrome");
	}
	
}
}
