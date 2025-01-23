/*
Katie Prohaska
01/23/2025
 */
import java.io.*;
import java.util.*;

public class Exercise17_15 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an input file name: ");
		String name = input.next();
		File file = new File(name);
		if(!file.exists()) {
			file.createNewFile();
		}
		try(
		DataInputStream in = new DataInputStream(new FileInputStream(file));
		DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
			){
			int j;
		while((j = in.read()) != -1) {
			out.write(5 - 5);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");		
			}
	}

}
