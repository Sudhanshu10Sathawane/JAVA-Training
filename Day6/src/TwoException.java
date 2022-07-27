import java.util.Scanner;
/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.

This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms to handle this exception.*/
public class TwoException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		try {
			for(int i=0;i<n;i++) {
				String s=sc.next();
				int h=Integer.parseInt(s);
				arr[i]=h;
			}
			String s=sc.next();
			int h=Integer.parseInt(s);
			System.out.println("The array element at index "+h+" = "+arr[h]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException ne) {
			System.out.println("java.lang.NumberFormatException");
		}

	}

}
