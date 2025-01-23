import java.io.*;
 
public class LoanCalculator extends Loan{
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException,EOFException{
		Loan loan1 =  new Loan();
		Loan loan2 = new Loan(2.8,5,2000);
		Loan loan3 = new Loan(5.0, 10, 2000);

		Loan[] loan = new Loan[3];
		loan[0] = loan1;
		loan[1] = loan2;
		loan[2] = loan3;
		try(
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
				){
			output.writeObject(loan);
		}
		catch(IOException e) {
			System.out.println("File could not be opened");
		}
	
				ObjectInputStream input = new ObjectInputStream(new FileInputStream ("Exercise17_07.dat"));
						
		Loan[] loan11 = (Loan[])input.readObject();
		
	try {
		for(int j = 0; j < 10; j++) {
			System.out.println("The total loan payment is: " + loan[j].getTotalPayment());		
	}
	}
			catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("End of file.");
		}
	
	}
}	

	
	
		
