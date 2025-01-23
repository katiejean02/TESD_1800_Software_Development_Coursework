/*
Katie Prohaska
01/23/2025
 */
import java.io.*;
import java.util.Scanner;

public class Exercise17_14 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an input file name: ");
		String name = input.nextLine();
		File file = new File(name);
		if(!file.exists()) {
			file.createNewFile();
		}
	
		
		try(
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
		){
			int j;
			while((j = in.read()) != -1) {
				output.write(5 + 5);
		}
		}
			catch(FileNotFoundException e) {
				System.out.println("File not found.");
		}
	}
}
