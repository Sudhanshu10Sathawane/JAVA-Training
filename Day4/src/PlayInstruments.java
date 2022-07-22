import java.util.Random;

abstract class Instrument{
	public abstract void play();
}
class Flute extends Instrument{
	public void play() {
	System.out.println("Flute is playing toot toot toot toot");
	}
}
class Piano extends Instrument{
	public void play() {
	System.out.println("Piano is playing tan tan tan tan");
	}
}
class Guitar extends Instrument{
	public void play() {
	System.out.println("Guitar is playing tin tin tin");
	}
}
public class PlayInstruments {

	public static void main(String[] args) {
		Instrument I[]=new Instrument[10];
		Random random = new Random();
		for(int i=0;i<10;i++) {
			int y=random.nextInt(3);
			if(y+1==1) {
				Flute F=new Flute();
				I[i]=F;
			}
			else if(y+1==2) {
				Piano P=new Piano();
				I[i]=P;
			}
			else if(y+1==3) {
				Guitar G=new Guitar();
				I[i]=G;
			}
		}
		for(int i=0;i<10;i++) {
//			System.out.println(arr[i]);
			I[i].play();
		}
		for(int i=0;i<10;i++) {
			if(I[i] instanceof Flute) {
				System.out.println(i+1+" Flute");
			}
			if(I[i] instanceof Piano) {
				System.out.println(i+1+" Piano");
			}
			if(I[i] instanceof Guitar) {
				System.out.println(i+1+" Guitar");
			}
			
		}

	}

}
