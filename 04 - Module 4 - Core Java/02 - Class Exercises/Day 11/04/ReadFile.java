public class ReadFile {
	public static void main(String[] args) {
		try {
			// consoleInput to read from Keyboard
			java.util.Scanner consoleInput = new java.util.Scanner(System.in);
			System.out.print("Filename? ");
			String fileName = consoleInput.nextLine();
			java.io.File file = new java.io.File(fileName); // throws exception if file not found
			/*
			 * fileInput to read from File
			 * fileInput is a handler to handle the file
			 * fileInput always points to BOF -> Begin Of File
			 */
			java.util.Scanner fileInput = new java.util.Scanner(file);
			/*
			 * to iterate thru the contents of the file, read each line from the file
			 * until the pointer reaches EOF -> End Of File
			 */
			while(fileInput.hasNextLine()) {
				System.out.println(fileInput.nextLine());
			} 
			fileInput.close();
			consoleInput.close();
		} catch(java.io.FileNotFoundException fnfe) {
			System.err.println("File not found.");
		}
	}
}