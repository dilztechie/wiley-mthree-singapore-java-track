class CommandLineArguments {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Error: Please re-enter the entire command, including "
					+ "an array size, initial value and increment");
			return;
		}
		// Integer is a wrapper class, parseInt() converts object to primitive data type
		int arrayLength = Integer.parseInt(args[0]); 
		int initialValue = Integer.parseInt(args[1]);
		int increment = Integer.parseInt(args[2]);
		int[] array = new int[arrayLength];
		for(int index = 0; index < array.length; ++index) {
			array[index] = initialValue + increment * index;		
		}
		System.out.println("index\tvalue");
		for(int index = 0; index < array.length; ++index) {
			System.out.println(index + "\t" + array[index]);
		}
	}
}