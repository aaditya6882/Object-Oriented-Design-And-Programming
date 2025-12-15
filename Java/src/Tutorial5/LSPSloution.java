package Tutorial5;
interface Flyable{
	void fly();
}
class Bird {
	public void eat() {
		System.out.println("Eat");
	}
}
class Sparrow extends Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("Sparroww is flying");
	}
}
class Penguin extends Bird{
	public void swim() {
		System.out.println("Swim");
	}
}
public class LSPSloution {
	public static void  letBirdFly(Flyable bird) {
		bird.fly();
	}
public static void main(String[] args) {
	Sparrow sparrow=new Sparrow();
	Penguin penguin=new Penguin();
	letBirdFly(sparrow);
	penguin.swim();
}
}
