package Tutorial4;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		while (true) {
//			list.add(1);
//		}
//		try {
//			String name = null;
//			System.out.println(name.length());
//		} catch (Exception e) {
//			System.out.println(e.getClass().getName());
//		}
		try {
//			FileReader fReader=new FileReader("java.txt");
//			String[] name= {"hi","hello","kxa"};
//			System.out.println(name[4]);
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number 1");
			double num1=scanner.nextDouble();
			System.out.println("Enter number 2");
			double num2= scanner.nextDouble();
			System.out.println(num1/num2);
			if (Double.isInfinite(num1/num2)) {
				System.out.println("Cannot divide by zero");
			}
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}catch (InputMismatchException e) {
			System.out.println("Enter valid integer");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
