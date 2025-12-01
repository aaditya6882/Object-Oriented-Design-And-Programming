package Tutorial2;

class Shape{
String color;
public Shape(String color) {
	this.color=color;
}
public void printArea() {

}
}
class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle( double length, double width, String color) {
		super(color);
		this.length=length;
		this.width=width;
	}
	@Override
	public void printArea() {
		System.out.println(color);
		System.out.println("Area of Rectangle = " + (length * width));
		System.out.printf("Area of Rectangle = %.2f", (length * width));
	}
}
public class Task6 {
public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(4.2, 3.5, "Red");
	rectangle.printArea();
}
}
