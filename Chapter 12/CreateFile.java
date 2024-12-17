/*
 Katie Prohaska
 Date: 12
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException {
		     
		java.io.File file = new java.io.File("c:\\Excercise12_15.txt");
		if(file.exists()) {
		java.io.PrintWriter output = new PrintWriter(file);
		for(int j = 0; j < 100; j++) {
				output.print((int)(Math.random() * 100) + " ");
		}
				output.close();
		}	
		Scanner input = new Scanner(file);
			Integer[] sort = new Integer[100]; 
			for(int k = 0; k < 100; k++) {
				sort[k] = input.nextInt();
			}
			Arrays.sort(sort);
			System.out.print("The list of integers in numerical order: ");
			for(int l = 0; l < 100; l++) {
			System.out.print(sort[l] + " ");
		}
	}
}	

	