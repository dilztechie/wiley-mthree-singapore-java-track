public class Bank {
	static java.util.Scanner in = new java.util.Scanner(System.in);
	static long id = 0;
	static org.wiley.bank.accounts.Account account;
	
	public static void main(String[] args) {
		int bankMenuOption = 0;
		while(true) {
			bankMenu();
			System.out.print("Option? ");
			bankMenuOption = in.nextInt();
			System.out.println();
			
			switch(bankMenuOption) {
				case 1: openAccount(); break;
				case 2: changeAccountDetails(); break;
				case 3: removeAccount(); break;
				case 0: System.exit(0);
				default: System.out.println("Invalid Bank Menu Option");
			}
			System.out.println();
			
			if(bankMenuOption == 1 && account != null) {
				int transactionMenuOption = 0;
				do {
					transactionMenu();
					System.out.print("Option? ");
					transactionMenuOption = in.nextInt();
					System.out.println();
					
					switch(transactionMenuOption) {
						case 1: depositAmount(); break;
						case 2: withdrawAmount(); break;
						case 3: changePin(); break;
						case 4: System.out.println("Account Balance = " + account.getBalance()); break;
						case 0: break;
						default: System.out.println("Invalid Transaction Menu Option");
					}
					System.out.println();
				} while(transactionMenuOption != 0);
			}
		}
	}
	
	static void bankMenu() {
		System.out.println("Bank Menu");
		System.out.println("---------");
		System.out.println("1. Open an Account");
		System.out.println("2. Change Account Details");
		System.out.println("3. Remove an Account");
		System.out.println("0. Exit");
	}
	
	static void openAccount() {
		System.out.print("Type of Account [SB - Savings / CC - Current]? ");
		if(in.hasNextLine()) {
			in.nextLine();
		}
		String type = in.nextLine();
		System.out.print("Name of the Account? ");
		String name = in.nextLine();
		System.out.print("Address of the Account Holder? ");
		String address = in.nextLine();
		System.out.print("Opening Balance? ");
		double balance = in.nextDouble();
		if(type.equalsIgnoreCase("sb")) {
			if(balance < org.wiley.atm.transactions.Transaction.SAVING_MINIMUM_BALANCE) {
				System.out.println("Opening Balance is less than Saving Minimum Balance");
				return;
			}
		} else {
			if(balance < org.wiley.atm.transactions.Transaction.CURRENT_MINIMUM_BALANCE) {
				System.out.println("Opening Balance is less than Current Minimum Balance");
				return;
			}
		}
		int pin = generatePin();
		if(type.equalsIgnoreCase("sb")) {
			account = new org.wiley.bank.accounts.Saving("sb", ++id, name, address, balance, pin);
		} else {
			account = new org.wiley.bank.accounts.Current("cc", ++id, name, address, balance, pin);
		}
		System.out.println("Account Created Successfully");
		System.out.println(account);
	}
	
	static void changeAccountDetails() {
		if(account == null) {
			System.out.println("No Account Found");
			return;
		}
		int changeMenuOption = 0;
		do {
			System.out.println(account);
			System.out.println("Change Menu");
			System.out.println("-----------");
			System.out.println("1. Account Name");
			System.out.println("2. Account Holder's Address");
			System.out.println("0. Exit to Bank Menu");
			System.out.print("Option? ");
			changeMenuOption = in.nextInt();
			System.out.println();
			switch(changeMenuOption) {
				case 1: changeName(); break;
				case 2: changeAddress(); break;
				case 0: break;
				default: System.out.println("Invalid Option");
			}
			System.out.println();
		} while(changeMenuOption != 0);
	}
	
	static void changeName() {
		System.out.print("Account Name? ");
		if(in.hasNextLine()) {
			in.nextLine();
		}
		String name = in.nextLine();
		account.setName(name);
	}
	
	static void changeAddress() {
		System.out.print("Account Holder's Address? ");
		if(in.hasNextLine()) {
			in.nextLine();
		}
		String address = in.nextLine();
		account.setAddress(address);
	}
	
	static void removeAccount() {
		if(account == null) {
			System.out.println("No Account Found");
			return;
		}
		System.out.println(account);
		System.out.print("Confirm Remove Account? ");
		if(in.hasNextLine()) {
			in.nextLine();
		}
		char confirm = in.nextLine().charAt(0);
		if(confirm == 'y' || confirm == 'Y') {
			account = null;
			System.out.println("Account Removed Successfully");
		}
	}
	
	static int generatePin() {
		java.util.Random random = new java.util.Random();
		int firstDigit = 1 + random.nextInt(4);
		int secondDigit = 1 + random.nextInt(4);
		int thirdDigit = 1 + random.nextInt(4);
		int fourthDigit = 1 + random.nextInt(4);
		return (firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + fourthDigit;
	}
	
	static void transactionMenu() {
		System.out.println("Transaction Menu");
		System.out.println("----------------");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Change PIN");
		System.out.println("4. Check Balance");
		System.out.println("0. Exit to Bank Menu");
	}
	
	static void depositAmount() {
		System.out.print("Amount to Deposit? ");
		double amount = in.nextDouble();
		if(amount <= 0) {
			System.out.println("Deposit Unsuccessfull");
		} else {
			System.out.println("Amount Deposited, Balance = " + account.deposit(amount));
		}
	}
	
	static void withdrawAmount() {
		System.out.print("Amount to Withdraw? ");
		double amount = in.nextDouble();
		if(amount <= 0) {
			System.out.println("Withdraw Unsuccessfull");
		} else {
			if(account.withdraw(amount)) {
				System.out.println("Amount Withdrawn, Balance = " + account.getBalance());
			} else {
				System.out.println("Insufficient Funds");
			}
		}
	}
	
	static void changePin() {
		System.out.print("Old Pin? ");
		int oldPin = in.nextInt();
		if(oldPin != account.getPin()) {
			System.out.println("Old Pin Incorrect");
			return;
		} 
		System.out.print("New Pin? ");
		int newPin = in.nextInt();
		if(account.changePin(newPin)) {
			System.out.println("Pin Changed Successfully");
		} else {
			System.out.println("Error in Pin Change");
		}
	}
}