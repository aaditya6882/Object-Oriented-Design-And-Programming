package Workshop6;

public class RectangleShape extends Shape {
	private double length;
	private double width;

	public RectangleShape(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}
}
