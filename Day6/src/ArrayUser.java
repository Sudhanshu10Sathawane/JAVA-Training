/*2) Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.

This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.*/
import java.util.*;
public class ArrayUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		try {
			int s=sc.nextInt();
			System.out.println("The array element at index "+s+" = "+arr[s]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		

	}

}
