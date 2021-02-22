class Scope {
	// field that is accessible to all members of this class only
	private int number = 1;
	
	// method begin() creates and initializes local variable number1
	// and calls methods 
	public void begin() {
		int number = 5; // method's local variable number shadows field number1
		
		useLocalVariable(); // useLocalVariable has local number
		useField(); // useField uses the class Scope's field number
		useLocalVariable(); // useLocalVariable has local number
		useField(); // useField uses the class Scope's field number
		
		System.out.println("local number in method begin is " + number);
		System.out.println("field number in method begin is " + this.number);
	}
	
	// create and initialize each time variable number1 during each call
	public void useLocalVariable() {
		int number = 25; // initialized each time useLocalVariable is called
		System.out.println("local number on entering useLocalVariable is " + number);
		++number; // modifies this method's local variable number only
	}
	
	public void useField() {
		System.out.println("field number on entering useField is " + number);
		number *= 12;
		System.out.println("field number before exiting useField is " + number);
	}
}