package Workshop2;

import java.lang.classfile.Superclass;

class Vehicle6{
	public void start() {
		System.out.println("Vehicle");
	}
}
class Car6 extends Vehicle6{
	@Override
	public void start() {
		super.start();
	}
	
}
public class Q6 {
public static void main(String[] args) {
	Car6 car6 =new Car6();
	car6.start();
}
}
