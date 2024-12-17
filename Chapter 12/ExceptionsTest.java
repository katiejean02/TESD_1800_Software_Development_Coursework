
import java.util.Scanner;

public class ExceptionsTest{

	public static int indexOf(int guess,Integer[] array) throws IndexOutOfBoundsException{

		Integer[] random = new Integer[100];
		if(guess > random.length) {
			throw new ArrayIndexOutOfBoundsException("Array out of bounds");
		}
		return guess;
	}



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			Integer[] random = new Integer[100];
				for(int i = 0; i < random.length; i++) {
					random[i] = (int)(Math.random() * 200);
	}	

		
		try {
			System.out.println("Enter an index of the array: ");
			int guess = input.nextInt();
			
			System.out.println(random[guess]);
			indexOf(guess, random);
			}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception: ArrayIndexOutOfBounds");
		}
		System.out.println("Execution continues...");
	}
}
