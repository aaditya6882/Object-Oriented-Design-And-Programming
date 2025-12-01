package Workshop2;

interface Runnable {
	void run();
}

class Car9 implements Runnable {

	@Override
	public void run() {
		System.out.println("Car is running.");
	}
}

public class Q9 {
	public static void main(String[] args) {
		Car9 car = new Car9();
		car.run();
	}
}
