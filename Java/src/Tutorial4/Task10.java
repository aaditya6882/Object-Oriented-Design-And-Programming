package Tutorial4;

import java.io.FileReader;
import java.io.IOException;

import Workshop3.Main;

public class Task10 {
	public static void readData() throws IOException{
		FileReader fReader=new FileReader("java.txt");
		fReader.close();
	}
	public static void main(String[] args){
		try {
			readData();
		} catch (IOException e) {
			System.out.println("Cannot read data");
		}
	}

}
