import java.util.Scanner;
public class SumAver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of elements of Array is "+sum);
		System.out.println("Average is "+((float)sum/(float)n));
	}
}
