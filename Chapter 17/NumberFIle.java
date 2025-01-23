/*
Katie Prohaska
01/23/2025
*/
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NumberFIle {
	public static void main(String[] args) throws IOException {
		File file = new File("Exercise_17_01");

		FileOutputStream output = new FileOutputStream("Exercise_17_01");
		
		for(int i = 0; i <= 200; i++) {
			output.write(i);
		}
		try (
		FileInputStream input = new FileInputStream("Exercise_17_01");
		){
		int value;
		while((value = input.read()) != -1) {
			System.out.print(value + " ");
		}
	}
	}

}
