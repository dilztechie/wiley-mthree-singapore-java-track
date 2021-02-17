public class Bank {
	public static void main(String[] args) {
		Account account = Account.getAccount();
		account.setId(1234567L);
		account.setName("Dilip");
		account.setBalance(30000);
		System.out.println(account);
	}
}