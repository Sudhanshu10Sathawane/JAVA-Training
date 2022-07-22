import java.util.Scanner;
public class PresAbsent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to search ");
		int ser=sc.nextInt();
		int j;
		for(j=0;j<n;j++) {
			if(arr[j]==ser) {
				System.out.println(j);
				break;
			}
		}
		if(j==n) {
			System.out.println("-1");
		}
		
	}
}
