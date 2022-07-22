
public class FirstFive {
	public static void main(String[] args) {
		int cnt=1;
		for(int i=1;cnt<=5;i++) {
			if(i%2==0 && i%3==0 && i%5==0) {
				cnt++;
				System.out.println(i);
			}
		}
	}
}
