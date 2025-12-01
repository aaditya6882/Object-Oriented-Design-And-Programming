package Workshop2;
class Vehicle{
	public void start() {
		System.out.println("Vehicle");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car Started");
	}
}
public class Q1 {
public static void main(String[] args) {
	Car car=new Car();
	car.start();
}
}
