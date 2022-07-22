import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Employ Number ");
//		int eno=sc.nextInt();
//		sc.nextLine();//Dummy Line
//		System.out.println("Enter Employ name ");
//		String s=sc.nextLine();
//		int i=1;
//		while(i<=10) {
//		System.out.println("Employ name is : "+s);
//		System.out.println("Employ id is : "+(eno+i));
//		i++;
//		}
		for(int j=1;j<=10;j++) {
			if(j==5) {
				continue;
			}
			System.out.println(j);
		}
	}
}
