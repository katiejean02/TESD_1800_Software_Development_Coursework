/*
Katie Prohaska
Date: 12/02/2024
*/
import java.util.Scanner;
public class TestMyAccount {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		MyAccount[] account1 = new MyAccount[10];
			for(int i = 0; i < 10; i++) {
				account1[i] = new MyAccount(i,100,5);
		}
			
			for(int k = 0; k < 100; k++) {
				System.out.println("Enter an ID: ");
				int ID = input.nextInt();
					if(ID < 10) {
						System.out.println("Main Menu");
						System.out.println("1: Check Balance");
						System.out.println("2: Withdraw");
						System.out.println("3: Deposit");
						System.out.println("4: Exit");
						int option = input.nextInt();
						while(option != 4) {
							if(option == 1) {
								System.out.println("The balance is " + account1[ID].getBalance());
								option = prompt();
							}
							if(option == 2) {
								account1[ID].withdraw();
								option = prompt();
							}
							if(option == 3) {
								account1[ID].deposit();
								option = prompt();
							}
							if(option == 4) {
								break;
							}
						}
					}
					
			}		
			
	}		
			
		public static int prompt() {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Main Menu");
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			int option = input.nextInt();	
			return option;
		
		}
			}