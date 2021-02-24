public class Editor {
	public static void main(String[] args) {
		try {
			java.util.Scanner consoleInput = new java.util.Scanner(System.in);
			System.out.print("filename? ");
			String filename = consoleInput.nextLine();
			/*
			 * Obtain a PrintWriter object to Write into the File
			 * Use the Constructor which takes in File object
			 */
			java.io.PrintWriter fileOutput = new java.io.PrintWriter(new java.io.File(filename));
			String text = "";
			System.out.println("Enter text in the Editor [type only 'quit' in a line to exit]:");
			do {
				text = consoleInput.nextLine(); // takes the text from the keyboard
				if(text.equalsIgnoreCase("quit")) { // 'quit' exits the loop
					break;
				}
				fileOutput.write(text); // writes the text to the output stream
				fileOutput.write("\n"); // newLine character to advance to new line
				fileOutput.flush(); // flushes the data from the output stream to the file
			} while(!text.equalsIgnoreCase("quit")); // exits the loop if the text has only 'quit'
			consoleInput.close(); // close the Console Input
		} catch(java.io.FileNotFoundException fnfe) {
			System.err.println("File not found");
		}
	}
}