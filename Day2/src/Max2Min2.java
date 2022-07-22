import java.util.Scanner;
public class Max2Min2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0],max2=arr[0],min=arr[0],min2=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {
				max2=max;
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<min2 && arr[i]>min) {
				min2=arr[i];
			}
		}
		System.out.println("Max is "+max);
		System.out.println("Min is "+min);
		System.out.println("Max2 is "+max2);
		System.out.println("Min2 is "+min2);
	}
}
