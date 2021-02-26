public class Rotate {
	public static void main(String[] args) {
		char[] characters = {'|', '/', '-', '\\', '-'};
		while(true) {
			for(int index = 0; index < characters.length; ++index) {
				System.out.print((char) 13);
				System.out.printf("%c\t%c\t%c", characters[index], characters[index], characters[index]);
				
				try {
					Thread.sleep(300);
				} catch(InterruptedException ie) {}
			}
		}
	}
}