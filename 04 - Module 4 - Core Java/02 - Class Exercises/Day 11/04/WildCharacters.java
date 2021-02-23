public class WildCharacters {
	public static void main(String[] args) {
		try {
			java.util.Scanner consoleInput = new java.util.Scanner(System.in);
			System.out.print("Filename? ");
			String fileName = consoleInput.nextLine();
			// points to current directory
			java.io.File directory = new java.io.File("."); // . indicates the current directory
			/*
			 * FileFilter is for filtering the Files
			 * Write an inner anonymous class to override interface method accept()
			 */
			java.io.File[] files = directory.listFiles(new java.io.FileFilter() {
				@Override
				public boolean accept(java.io.File file) {
					if(file.getName().startsWith(fileName)) {
						return true;
					}
					return false;
				}
			});
			// Incomplete Code
			java.util.Scanner fileInput = new java.util.Scanner(new java.io.File(fileName));
			consoleInput.close();	
		} catch(java.io.FileNotFoundException fnfe) {
			System.err.println("File not found");
		}
	}
}