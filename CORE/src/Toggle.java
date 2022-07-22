import java.util.Scanner;
public class Toggle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a alphabet : ");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z') {
			System.out.println((char)(ch-'a'+'A'));
		}
		else {
			System.out.println((char)(ch-'A'+'a'));	
		}
	}
}
