import java.util.Scanner;
public class TestSavingsandCheckingsAccount extends Account{

	public TestSavingsandCheckingsAccount() {		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] account3 = new Account[10];
		SavingsAccount[] account2 = new SavingsAccount[10];
		CheckingsAccount[] account1 = new CheckingsAccount[10];
			for(int i = 0; i < 10; i++) {
				account2[i] = new SavingsAccount(i,100,5,0);
				account1[i] = new CheckingsAccount(i,100,5,100);
				account3[i] = new Account(i,100,5);
			}
			
			System.out.println("Account Choice");
			System.out.println("1) Checkings");
			System.out.println("2) Savings");
			System.out.println("3) Account");
			int choice = input.nextInt();
			
				if(choice == 1 || choice == 3) {
					for(int k = 0; k < 100; k++) {
						System.out.println("Enter an ID: ");
						int ID = input.nextInt();
							if(ID < 10) {
								System.out.println("Main Menu");
								System.out.println("1: Check Balance");
								System.out.println("2: Withdraw");
								System.out.println("3: Deposit");
								System.out.println("4: Overdraft");
								System.out.println("5: Exit");
								int option = input.nextInt();
								while(option != 5) {
									if(option == 1) {
										System.out.println("The balance is " + account1[ID].getBalance());
										option = prompt2();
									}
									if(option == 2) {
										System.out.println("Enter an amount you want to withdraw: ");
										double withdraw = input.nextDouble();
										account1[ID].withdraw(withdraw);
										option = prompt2();
									}
									if(option == 3) {
										account1[ID].deposit();
										option = prompt2();
									}
									if(option == 4) {
										account1[ID].overdraft();
										option = prompt2();
									}
									if(option == 5) {
										System.out.println(account1[ID].toString());
										break;
									}
								}
							}
					}
				}

		 if(choice == 2) { 
			for(int j = 0; j < 100; j++) {
				System.out.println("Enter an ID: ");
				int ID1 = input.nextInt();
					if(ID1 < 10) {
						System.out.println("Main Menu");
						System.out.println("1: Check Balance");
						System.out.println("2: Withdraw");
						System.out.println("3: Deposit");
						System.out.println("4: Exit");
						int option = input.nextInt();
						while(option != 4) {
							if(option == 1) {
								System.out.println("The balance is " + account2[ID1].getBalance());
								option = prompt1();
							}
							if(option == 2) {
								account2[ID1].withdraw();
								option = prompt1();
							}
							if(option == 3) {
								account2[ID1].deposit();
								option = prompt1();
							}
							if(option == 4) {
								System.out.println(account2[ID1].toString());
								break;
							}
					}
					}
			}
		 }
			}
	
		public static int prompt1() {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Main Menu");
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			int option = input.nextInt();	
			return option;
		}				
	
		public static int prompt2() {
			Scanner input = new Scanner(System.in);
			System.out.println("Main Menu");
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Overdraft");
			System.out.println("5: Exit");
			int option = input.nextInt();	
			return option;
		}
}