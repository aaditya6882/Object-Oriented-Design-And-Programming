package Workshop5;

class Computer {
	private Processor processor;

	public Computer() {
		processor = new Processor("Intel i7");
	}

	public void showComputerDetails() {
		processor.showSpecs();
	}
}

class Processor {
	private String model;

	public Processor(String model) {
		this.model = model;
	}

	public void showSpecs() {
		System.out.println("Processor model: " + model);
	}
}

public class Q10 {
public static void main(String[] args) {
	Computer computer=new Computer();
	computer.showComputerDetails();
}
}
