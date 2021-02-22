public class AccountHolder {
	public static void main(String[] args) {
		Account account1 = new Account(-1000);
		System.out.println("Account1[initialBalance=" + account1.getBalance() + "]");
		Account account2 = new Account(5000);
		System.out.println("Account2[initialBalance=" + account2.getBalance() + "]");
		System.out.println("Credit 3000 to account1, balance=" + account1.credit(3000));
		System.out.println("Debit 2000 from account2, balance=" + account2.debit(2000));
	}
}