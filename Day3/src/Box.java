import java.util.Scanner;
public class Box {
	int h;
	int w;
	int d;
	Box(int h,int w,int d){
		this.h=h;
		this.w=w;
		this.d=d;
	}
	int volume() {
		return h*d*w;
	}
	public static void main(String[] args) {
		Box b1=new Box(4,5,6);
		Box b2=new Box(10,20,30);
		System.out.println("Volume of b1 is : "+b1.volume());
		System.out.println("Volume of b2 is : "+b2.volume());
	}
}
