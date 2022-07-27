import java.util.*;
import java.util.function.Predicate;
public class Java8Tester {
	static void  eval(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer n:list)
		{
			if(predicate.test(n)){
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Print all numbers :");
		eval(list,(n)->true);
		System.out.println("Print Even numbers :");
		eval(list,(n)->n%2==0);
		System.out.println("Print numbers greater than 3 :");
		eval(list,(n)->n>3);
	}

}
