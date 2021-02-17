public class Account {
	private long id;
	private String name;
	private double balance;
	
	public static Account getAccount() {
		return new Account();
	}
	
	private Account() {}

	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}