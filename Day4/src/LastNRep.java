import java.util.Scanner;
public class LastNRep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String col[]=s.split(",");
		int rep=Integer.parseInt(col[1]);
		String e=col[0].substring(col[0].length()-rep,col[0].length());
		for(int i=0;i<rep;i++) {
			System.out.print(e);
		}
	}

}
