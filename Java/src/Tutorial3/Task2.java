package Tutorial3;
class AreaCalculator{
	public void calculateArea(int length , int width) {
		double area=length*width;
		System.out.println("Rectangle: "+area);
	}
	public void calculateArea(double length) {
		double area=Math.pow(length, 2);
		System.out.println("Square: "+area);
	}
	public void calculateArea(double base, double height) {
		double area=0.5*base*height;
		System.out.println("Triangle: "+area);
	}
}
public class Task2 {
public static void main(String[] args) {
	AreaCalculator areaCalculator=new AreaCalculator();
	areaCalculator.calculateArea(5);
	areaCalculator.calculateArea(2, 3);
	areaCalculator.calculateArea(4.0, 3.0);
}
}
