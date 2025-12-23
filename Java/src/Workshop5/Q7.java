package Workshop5;

interface Swimmable {
	void swim();
}

interface Quackable {
	void quack();
}

class RealDuck implements Swimmable, Quackable {
	public void swim() {
		System.out.println("Swimming");
	}

	public void quack() {
		System.out.println("Quacking");
	}
}

class WoodenDuck implements Swimmable {
	public void swim() {
		System.out.println("Floating on water");
	}
}

public class Q7 {
	public static void main(String[] args) {

	}
}
