class GeneralBank{
	void getSavingsInterestRate() {
		System.out.println("This is General Bank Savings.");
	}
	void getFixedDepositInterestRate() {
		System.out.println("This is General Bank Fixed.");
	}
}
class ICICIBank extends GeneralBank{
	void getSavingsInterestRate() {
		System.out.println("This is ICICI Bank Savings with 4%.");
	}
	void getFixedDepositInterestRate() {
		System.out.println("This is ICICI Bank Fixed with 8.5%.");
	}
}
class KotMBank extends GeneralBank{
	void getSavingsInterestRate() {
		System.out.println("This is KotMBank Bank Savings with 6%.");
	}
	void getFixedDepositInterestRate() {
		System.out.println("This is KotMBank Bank Fixed with 9%.");
	}
}

public class InterRate {
	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();

		 KotMBank k=new KotMBank();

		 GeneralBank g=new KotMBank();

		 GeneralBank l=new ICICIBank();
		 GeneralBank f=new GeneralBank();
		 i.getFixedDepositInterestRate();
		 i.getSavingsInterestRate();
		 k.getFixedDepositInterestRate();
		 k.getSavingsInterestRate();
		 g.getFixedDepositInterestRate();
		 g.getSavingsInterestRate();
		 l.getFixedDepositInterestRate();
		 l.getSavingsInterestRate();
		 f.getFixedDepositInterestRate();
		 f.getSavingsInterestRate();
	}
}
