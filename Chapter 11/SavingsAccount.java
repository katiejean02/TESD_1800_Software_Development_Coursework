import java.util.Scanner;
public class SavingsAccount extends Account{
	Scanner input = new Scanner(System.in);
	private double balance;
	private double withdraw;

	public SavingsAccount(int ID, double balance, double annualInterestRate, double overdraft) {
		super(ID, balance, annualInterestRate);
		
	}
	
	

	public double withdraw() {
		this.balance = this.getBalance();
		System.out.println("Enter the amount you would like to withdraw: ");
		double withdraw = input.nextDouble();
		if(withdraw < this.balance) {
			this.balance -= withdraw;
			System.out.println("Your balance is " + this.balance);
		}
		else { 
			System.out.println("You can not overdraft this account.");
		}
		return this.balance;
		
	}
	@Override
	public String toString() {
		setBalance(balance);
		return super.toString();
	}
}