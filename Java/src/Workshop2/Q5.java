package Workshop2;
class Animal5{
	public Animal5() {
		System.out.println("Animal Created");
	}
}
class Dog5 extends Animal5{
	public Dog5() {
		super();
		System.out.println("Dog Created");
	}
}
public class Q5 {
public static void main(String[] args) {
	Dog5 dog =new Dog5();
}
}
