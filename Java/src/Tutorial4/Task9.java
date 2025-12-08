package Tutorial4;

public class Task9 {
public static void main(String[] args) {
	int marks=110;
	if(marks>100 || marks<0) {
		throw new ArithmeticException();
	}
	System.out.println(marks);
}
}
