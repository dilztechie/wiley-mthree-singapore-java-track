public class EditorWithEOF {
	public static void main(String[] args) {
		java.util.Scanner consoleInput = null;
		java.io.PrintWriter fileOutput = null;
		try {
			consoleInput = new java.util.Scanner(System.in);
			System.out.print("filename? ");
			String filename = consoleInput.nextLine();
			/*
			 * Obtain a PrintWriter object to Write into the File
			 * Use the Constructor which takes in File object
			 */
			fileOutput = new java.io.PrintWriter(new java.io.File(filename));
			String text = "";
			System.out.println("Enter text in the Editor ['^Z' - EOF to Exit]:");
			while(true) {
				text = consoleInput.nextLine(); // takes the text from the keyboard
				fileOutput.write(text); // writes the text to the output stream
				fileOutput.write("\n"); // newLine character to advance to new line
				fileOutput.flush(); // flushes the data from the output stream to the file
			}
		} catch(java.io.FileNotFoundException fnfe) {
			System.err.println("File not found");
		} catch(java.util.NoSuchElementException nsee) { // exception occurs if EOF is found
			System.out.println("Contents written to file");
		} finally { // close all the resources
			fileOutput.close();
			consoleInput.close();
		}
	}
}