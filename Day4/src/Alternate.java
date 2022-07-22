import java.util.Scanner;
public class Alternate {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int n=s.length();
			String col[]=s.split(",");
			int n1=col[0].length();
			int n2=col[1].length();
			String ans="";
			if(n1<=n2) {
				int i;
				for(i=0;i<n1;i++) {
					ans+=col[0].charAt(i);
					ans+=col[1].charAt(i);
				}
				for(;i<n2;i++) {
					ans+=col[1].charAt(i);
				}
			}
			else {
				int i;
				for(i=0;i<n2;i++) {
					ans+=col[0].charAt(i);
					ans+=col[1].charAt(i);
				}
				for(;i<n1;i++) {
					ans+=col[0].charAt(i);
				}
				
			}
			
			System.out.println(ans);
			
		}
		
}
