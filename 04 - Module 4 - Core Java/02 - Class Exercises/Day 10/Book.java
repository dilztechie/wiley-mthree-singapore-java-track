public enum Book {
	Book01("Core Java Volume I – Fundamentals", "Cay S. Horstmann", "Prentice Hall"),
	Book02("Effective Java", "Joshua Bloch", "Addison Wesley"),
	Book03("Java: A Beginner’s Guide", "Herbert Schildt", "McGraw-Hill Education"),
	Book04("One", "HS", "McGraw-Hill Education"),
	Book05("Two: EJ", "JB", "McGraw-Hill Education"),
	Book06("Three", "Herbert Schildt", "McGraw-Hill Education"),
	Book07("Four", "TMJ", "Tata"),
	Book08("Dilz Complete Guide", "Dilip Malani", "Dilz Education Inc."),
	Book09("Nine", "Kiran", "McGraw-Hill Education"),
	Book10("Ten", "Herbert Schildt", "McGraw-Hill Education"),
	Book11("Eleven", "Herbert Schildt", "McGraw-Hill Education"),
	Book12("Twelve", "Herbert Schildt", "McGraw-Hill Education"),
	Book13("Thirteen", "Herbert Schildt", "McHE");
	
	private final String title;
	private final String author;
	private final String publisher;
	
	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}	
}