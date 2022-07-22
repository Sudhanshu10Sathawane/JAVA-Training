import java.util.Scanner;
public class Calculator {
	static int powerInt(int num1,int num2) {
		int temp=1;
		for(int i=1;i<=num2;i++) {
			temp=temp*num1;
		}
		return temp;
	}
	static double powerDouble(double num1,int num2) {
		double temp=1;
		for(int i=1;i<=num2;i++) {
			temp=temp*num1;
		}
		return temp;
	}
	public static void main(String[] args) {
		System.out.println("powerInt : "+powerInt(4,5));
		System.out.println("powerDouble : "+powerDouble(1.2,2));
	}
}
