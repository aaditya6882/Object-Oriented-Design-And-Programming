package Workshop4;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ForkJoinTask;

public class Q25 {
	public static void readfile() throws IOException {
		FileReader fileReader=new FileReader("Q25.txt");
		fileReader.read();
	}
	public static void divide() {
		int num=0;
		if (num==0) {
			throw new ArithmeticException();
		}
		System.out.println(10/num);
	}
public static void main(String[] args) throws IOException {
	readfile();
	divide();
}
}
