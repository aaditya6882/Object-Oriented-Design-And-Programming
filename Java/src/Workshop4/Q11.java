package Workshop4;

import java.io.FileReader;
import java.io.IOException;

public class Q11 {
	public static void readData() throws IOException{
		FileReader fileReader=new FileReader("main.txt");
		System.out.println(fileReader.read());
	}
	public static void main(String[] args) {
		try {
			readData();
		} catch (Exception e) {
			System.out.println("Cannot read data");
		}finally {
			System.out.println("Code Ended");
		}
	}
}
