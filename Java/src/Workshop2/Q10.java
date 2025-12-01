package Workshop2;

interface Swimable {
	void swim();
}

interface Flyable10 {
	void fly();
}

class Duck implements Swimable, Flyable10 {

	@Override
	public void swim() {
		System.out.println("Duck is swimming.");
	}

	@Override
	public void fly() {
		System.out.println("Duck is flying.");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.swim();
		duck.fly();
	}
}
