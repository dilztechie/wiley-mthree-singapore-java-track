class Interest {
	public static void main(String[] args) {
		double amount, principal = 1000.0, rate = 0.18;
		
		System.out.printf("%5s\t%20s\n", "Year", "Amount on Deposit");
		for(int year = 1; year <= 10; ++year) {
			amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%5d\t%,20.2f\n", year, amount);
		}
	}
}