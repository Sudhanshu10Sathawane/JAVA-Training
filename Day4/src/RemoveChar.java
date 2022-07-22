import java.util.Scanner;
public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String ans="";
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='*') {
				ans=ans.substring(0,i-1);
				i++;
			}
			else {
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
		
	}
}
