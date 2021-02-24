public class FileDemonstration {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Filename? ");
		java.io.File file = new java.io.File(in.nextLine());
		if(file.exists()) {
			System.out.println("File " + file.getName() + " exists");
			System.out.println("Is a File? " + file.isFile());
			System.out.println("Is a Directory? " + file.isDirectory());
			System.out.println("Last Modified Date: " + file.lastModified());
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			if(file.isDirectory()) {
				String[] directory =  file.list();
				System.out.println("Files in Directory " + file.getName());
				for(String fileName : directory) {
					System.out.println(fileName);
				}
			}
		} else {
			System.out.println("File " + file.getName() + " does not exists");
		}
		in.close();
	}
}