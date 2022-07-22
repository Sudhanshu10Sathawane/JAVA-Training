class Animal{
	String typeAnimal;
	void eat() {
		System.out.println(typeAnimal+" is eating.");
	}
	void sleep() {
		System.out.println(typeAnimal+" is sleeping.");
	}
}
public class Bird extends Animal {
	void fly() {
		System.out.println(typeAnimal+" is flying.");
	}
	public static void main(String[] args) {
		Animal A1=new Animal();
		Bird kiwi=new Bird();
		A1.typeAnimal="Bear";
		kiwi.typeAnimal="Kiwi";
		A1.eat();
		A1.sleep();
		kiwi.eat();
		kiwi.sleep();
		kiwi.fly();
	}

}
