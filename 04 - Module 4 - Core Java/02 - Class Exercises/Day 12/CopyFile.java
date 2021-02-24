public class CopyFile {
	public static void main(String[] args) {
		java.util.Scanner consoleInput = null;
		java.util.Scanner fileInput = null;
		java.io.PrintWriter fileOutput = null;
		try {
			consoleInput = new java.util.Scanner(System.in);
			System.out.print("Source File? ");
			String source = consoleInput.nextLine(); // take the source filename from the user
			System.out.print("Destination File? ");
			String destination = consoleInput.nextLine(); // take the destination filename from the user
			// obtain a reader for reading from file
			fileInput = new java.util.Scanner(new java.io.File(source));
			// obtain a writer to write to file
			fileOutput = new java.io.PrintWriter(new java.io.File(destination));
			// iterate thru lines of source and write to destination
			while(true) {
				String line = fileInput.nextLine(); // read a line from source file
				fileOutput.write(line); // write the line to writer
				fileOutput.write("\n"); // produce a new line to write
				fileOutput.flush(); // flush writer data to destination file
			}
		} catch(java.io.FileNotFoundException fnfe) {
			System.err.println("Source File not found");
		} catch(java.util.NoSuchElementException nsee) { // occurs if EOF
			System.out.println("File Copied Successfully");
		} finally { // close all resources
			fileOutput.close();
			fileInput.close();
			consoleInput.close();
		}
	}
}