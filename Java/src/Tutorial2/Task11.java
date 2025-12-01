package Tutorial2;

interface Shapes{
	void CalculateArea();
	void CalculatePerimeter();
}
class Circle implements Shapes{
	double radius;
	@Override
	public void CalculateArea() {
		
		System.out.println("Area of Radius ="+ ((Math.PI)*(Math.pow(radius, 2))));
	}

	@Override
	public void CalculatePerimeter() {
		System.out.println("Perimeter="+ (2*Math.PI *radius));
		
	}
	
}
public class Task11 {
public static void main(String[] args) {
	Circle circle=new Circle();
	circle.radius=7;
	circle.CalculateArea();
	circle.CalculatePerimeter();
}
}
