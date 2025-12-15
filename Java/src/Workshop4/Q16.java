package Workshop4;

import java.io.FileReader;
import java.io.IOException;

public class Q16 {
	public static void method1() throws IOException {
		FileReader fileReader = new FileReader("java.txt");
	}

	public static void method2() throws IOException {
		method1();
	}

	public static void main(String[] args) throws IOException {
		try {
			method2();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
