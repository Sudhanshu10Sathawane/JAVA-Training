import java.util.Scanner;
public class Concat {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		String s1="",s2="";
		int i;
		for(i=0;i<n;i++) {
			if(s.charAt(i)==',') {
				break;
			}
			else {
				s1+=s.charAt(i);
			}
		}
		i++;
		for(;i<n;i++) {
			s2+=s.charAt(i);
		}
//		System.out.println(s1);
//		System.out.println(s2);
		int n1=s1.length();
		int n2=s2.length();
		if(s1.charAt(n1-1)!=s2.charAt(0)) {
			String ans=s1.toLowerCase()+" "+s2.toLowerCase();
			System.out.println(ans);
		}
		else {
			String ans="";
			for(int j=0;j<n1-1;j++) {
				ans+=s1.charAt(j);
			}
			ans=ans.toLowerCase();
			ans+=s2.toLowerCase();
			System.out.println(ans);
		}
	}
}
