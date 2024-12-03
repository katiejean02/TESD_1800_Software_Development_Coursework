import java.util.Scanner;
public class MyAccount {
		Scanner input = new Scanner(System.in);

				private int Id = 0;
				private double balance = 0;
				private double annualInterestRate = 0;
				private java.util.Date dateCreated = new java.util.Date();
				double MonthlyInterestRate;
				double MonthlyInterest;
				
				MyAccount(){	
					
				}
				MyAccount(int newID, double newBalance, double newannualInterestRate){
					Id = newID;
					balance = newBalance;
					annualInterestRate = newannualInterestRate;
				}
				public int getID() {
					return Id;
				}
				public void setID(int newID) {
					Id = newID;
				}
				public double getBalance() {
					return balance;
				}
				public void setBalance(double newBalance) {
					balance = newBalance;
				}
				public double getannualInterestRate() {
					return annualInterestRate;
				}
				public void setannualInterestRate(double newannualInterestRate) {
					annualInterestRate = newannualInterestRate;
				}
				public java.util.Date getDate(){
					System.out.println("This account was created on " + dateCreated.toString());
					return dateCreated;
				}
				public double getMonthlyInterestRate() {
					MonthlyInterestRate = annualInterestRate / 100 / 12;
					return MonthlyInterestRate;
				}
				public double getMonthlyInterest() {
					MonthlyInterest = balance * MonthlyInterestRate;
					System.out.println("The monthly interest is " + MonthlyInterest);
					return MonthlyInterest;
				}
				public double withdraw() {
					System.out.println("Enter the amount you would like to withdraw: ");
					Scanner input = new Scanner(System.in);
					double withdraw = input.nextDouble();
					balance -= withdraw;
					System.out.println("Your new balance is " + balance);
					return balance;
				}
				public double deposit(){
					Scanner input = new Scanner(System.in);
					System.out.println("Enter the amount you'd like to deposit: ");
					double deposit = input.nextDouble();
					balance += deposit;
					System.out.println("Your new balance is " + balance);
					return balance;
			}
				public boolean equals(MyAccount myInt) {
					if(this.Id == myInt.Id)
						return true;
					else
						return false;
				}
		}