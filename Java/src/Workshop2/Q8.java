package Workshop2;

abstract class Appliance {
	public void turnOn() {
		System.out.println("Appliance");
	}

	abstract void operate();
}

class WashingMachine extends Appliance {
	@Override
	void operate() {
		System.out.println("WashingMachine");
	}
}

public class Q8 {
	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine();
		wm.turnOn();
		wm.operate();
	}
}
