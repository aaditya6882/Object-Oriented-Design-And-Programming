package Workshop4;

import java.io.FileReader;
import java.io.IOException;

public class Q20 {
	public static void readData() throws IOException {
		try {
			FileReader fr = new FileReader("java.txt");
			fr.read();
		} catch (Exception e) {
			throw new IOException("File does not exist", new NullPointerException());
		}
	}

	public static void main(String[] args) {
		try {
			readData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
