public class AppendFiles {
	public static void main(String[] args) {
		java.io.PrintWriter fileWriter = null; // Writer to write to file
		java.util.Scanner fileReader = null; // Reader to read from file
		try {
			if(args.length < 2) { // if syntax is wrong throw exception
				throw new ArrayIndexOutOfBoundsException(
						"Syntax: java AppendFiles destination source1 source2 ...");
			}
			fileWriter = new java.io.PrintWriter(new java.io.File(args[0])); // open destination file
			for(int index = 1; index < args.length; ++index) { // iterate thru all source files
				String sourceFilename = null;
				try {
					sourceFilename = args[index];
					fileReader = new java.util.Scanner(new java.io.File(sourceFilename)); // open source file
					// header
					fileWriter.write("/*** Contents of File " + sourceFilename + " ***/");
					fileWriter.write("\n");
					fileWriter.flush();
					while(fileReader.hasNextLine()) { // check if there are more lines
						fileWriter.write(fileReader.nextLine()); // write line in writer
						fileWriter.write("\n");
						fileWriter.flush();
					}
					// footer
					fileWriter.write("/*** End of File " + sourceFilename + " ***/");
					fileWriter.write("\n\n");
					fileWriter.flush();
					fileReader.close(); // close source file
				} catch(java.io.FileNotFoundException fnfe) { // exception for source files not found
					System.err.println("File not found " + sourceFilename);
				}
			}
			fileWriter.close(); // close destination file
		} catch(java.io.FileNotFoundException fnfe) { // exception for destination file not found
			System.err.println("File not found");
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.err.println(aioobe.getMessage()); // displays error
		} 
	}
}