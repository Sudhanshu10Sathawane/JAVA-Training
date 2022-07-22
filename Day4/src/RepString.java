import java.util.Scanner;
public class RepString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rep=s.substring(0,2);
				String ans="";
				int n=s.length();
		for(int i=0;i<n;i++) {
			ans+=rep;
		}
		System.out.println(ans);
	}
}
