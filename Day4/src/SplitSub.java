import java.util.Scanner;
public class SplitSub {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String col[]=s.split(",");
		String ans="";
		String rep=col[1];
		String h=col[0].replaceAll(rep,"#");
		for(int i=0;i<h.length();i++) {
			if(h.charAt(i)=='#' && i!=0 && i!=h.length()-1) {
				ans+=h.charAt(i-1);
				ans+=h.charAt(i+1);
			}
			else if(h.charAt(i)=='#' && i==0) {
				ans+=h.charAt(i+1);
			}
			else if(h.charAt(i)=='#' && i==h.length()-1) {
				ans+=h.charAt(i-1);
			}
		}
		System.out.println(ans);
		
	}
}
