public class WildCharacters {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws java.io.FileNotFoundException {
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
					// match the start characters of the file with the fileName
					if(file.getName().startsWith(fileName)) { 
						return true; // puts the file in the array
					}
					return false; // does not put the file in the array
				}
			});
			/*
			 * if there are no matching files then
			 * files array will be empty and files.length == 0
			 * throw java.io.FileNotFoundException
			 */
			if(files.length == 0) {
				throw new java.io.FileNotFoundException("no file(s) matching are found");
			}
			for(java.io.File file : files) { // iterate thru all the matching files in the array
				java.util.Scanner fileInput = new java.util.Scanner(file); // open the file
				System.out.println("Contents of File " + file.getName() + ":");
				// iterate thru lines of text in the file and display
				while(fileInput.hasNextLine()) {
					System.out.println(fileInput.nextLine());
				} 
				System.out.println("*** End of File " + file.getName() + " ***");
				System.out.println();
				fileInput.close(); // close the file
			}
			consoleInput.close();
		} catch(java.io.FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}
	}
}