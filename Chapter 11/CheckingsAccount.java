
import java.util.Scanner;

	public class CheckingsAccount extends Account{
		Scanner input = new Scanner(System.in);
		private double balance;
		private double overdraft;


	public CheckingsAccount(int ID, double balance, double annualInterestRate, double overdraft) {
		super(ID,balance, annualInterestRate);
		overdraft = this.overdraft;
	}
	
	public CheckingsAccount(double newOverdraft) {
		overdraft = newOverdraft;
	}
	public double getOverdraft() {
		return this.overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	public double withdraw() {
		System.out.println("Enter the amount you'd like to withdraw: ");
		double withdraw = input.nextInt();
		this.balance -= withdraw;
		System.out.println("Your balance is " + this.balance);
		return this.balance;
	}
	@Override
	public String toString() {
		setBalance(balance);
		setOverdraft(overdraft);
		return super.toString() + ". You overdrafted this amount on your account: " + overdraft;
	}
	public double overdraft() {
		System.out.println("Enter the amount you would like to overdraft: ");
		double overdraft = input.nextDouble();
		setOverdraft(overdraft);
		if(overdraft > 100) {
			System.out.println("Your can not overdraft over $100 on your account, please re-enter a valid amount.");
			overdraft = input.nextDouble();
		}
		else
		balance -= overdraft;
		System.out.println("Your new balance is " + this.balance);
		return this.balance;
	}
}
