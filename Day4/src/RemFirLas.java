import java.util.Scanner;
public class RemFirLas {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="";
		int n=s.length();
		for(int i=1;i<n-1;i++) {
			ans+=s.charAt(i);
		}
		System.out.println(ans);
	}
}
