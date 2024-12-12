/*
 Katie Prohaska
 Date: 11/21/2024
 */
import java.util.Scanner;
		public class Account {
			private int ID = 0;
			private double balance = 100;
			private double annualInterestRate = 5;
			private java.util.Date dateCreated = new java.util.Date();
			double MonthlyInterestRate;
			double MonthlyInterest;
			private double withdraw;
			
			
			Account(){	
				int ID;
				double balance;
				double annualInterestRate;
				double overdraft;
				
			}

			Account(int newID, double newBalance, double newAnnualInterestRate){
				ID = newID;
				balance = newBalance;
				annualInterestRate = newAnnualInterestRate;
			
			}

			public int getID() {
				return ID;
			}

			public void setID(int newID) {
				ID = newID;
			}
			public double getBalance() {
				return balance;
			}
			public void setWithdraw(double newWithdraw) {
				withdraw = newWithdraw;
			}
			public double getWithdraw() {
				return withdraw;
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

			public double deposit(){
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the amount you'd like to deposit: ");
				double deposit = input.nextDouble();
				balance += deposit;
				System.out.println("Your new balance is " + balance);
				return balance;
		}

			public double withdraw(double withdraw) {
				this.balance -= withdraw;
				System.out.println("Your balance is" + this.balance);
				return this.balance;
			}
			public String toString() {
				return "created on " + dateCreated + ". Your account number is: " + ID + ". Your balance is: " + balance + ". Your annual interest rate is: " + annualInterestRate;
			}

		}