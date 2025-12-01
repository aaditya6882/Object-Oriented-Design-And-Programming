package Workshop2;

import java.security.PublicKey;

interface Flyable{
	 void fly();
}
class Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("Bird");
	}
}
class Animal4{
	public void eat() {
		System.out.println("Animal");
	}
}
class Eagle extends Animal4 implements Flyable{
	@Override
	public void fly() {
		System.out.println("Eagle");
	}
}
public class Q4 {
public static void main(String[] args) {
	Eagle eagle=new Eagle();
	eagle.fly();
	eagle.eat();
}
}
