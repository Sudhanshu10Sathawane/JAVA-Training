import java.util.*;
/*4) Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/
public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		try {
			int sum=0;
		for(int i=0;i<5;i++) {
			 int k=Integer.parseInt(args[i]);
			 arr[i]=k;
			 sum+=arr[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+(sum/5));
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException ne) {
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
