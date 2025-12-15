package Workshop4;

import java.io.FileReader;
import java.io.IOException;

public class Q15 {
	public static void method1() throws IOException {
		FileReader fileReader = new FileReader("java.txt");
	}

	public static void method2() throws IOException {
		method1();
	}

	public static void main(String[] args) {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
