
public class ThisKey {
	 int i=5;//instance variable

	 void disp(int i)

	 {

	 this.i=i;

	 }
	 public static void main(String[] args) {

		 ThisKey ob=new ThisKey();

		 System.out.println(ob.i);

		 ob.disp(10);

		 System.out.println(ob.i);

		 }
}
