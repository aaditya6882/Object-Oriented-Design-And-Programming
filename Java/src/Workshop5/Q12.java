package Workshop5;

class Engine {
	String name;
	public Engine(String name) {
		this.name=name;
	}
	public void showEngienename() {
		System.out.println(name);
	}
}

class Car {

	private Engine engine;
	 
	public Car(Engine engine) {
		this.engine=engine;
	}
	public void showEngiene() {
		engine.showEngienename();
	}
}

public class Q12 {
public static void main(String[] args) {
	Engine engine=new Engine("V2");
	Car car=new Car(engine);
	car.showEngiene();
	car=null;
	engine.showEngienename();
}
}
