import java.util.Random;   
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		return "FirstClass";
	}
}
class Ladies extends Compartment{
	public String notice() {
		return "Ladies";
	}
}
class General extends Compartment{
	public String notice() {
		return "General";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "Luggage";
	}
}
public class TestCompartment {
	public static void main(String[] args) {
		Random random = new Random();  
		Compartment arr[]=new Compartment[10];
		for(int i=0;i<10;i++) {
			int y=random.nextInt(4);
			if(y+1==1) {
				Ladies L1=new Ladies();
				arr[i]=L1;
			}
			else if(y+1==2) {
				FirstClass F1=new FirstClass();
				arr[i]=F1;
			}
			else if(y+1==3) {
				Luggage L=new Luggage();
				arr[i]=L;
			}
			else if(y+1==4){
				General G=new General();
				arr[i]=G;
			}
		}
		for(int i=0;i<10;i++) {
//			System.out.println(arr[i]);
			System.out.println(arr[i].notice());
		}
	}
}
