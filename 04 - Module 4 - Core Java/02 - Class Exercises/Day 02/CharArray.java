public class CharArray {
	public static void main(String[] args) {
		char[] characters = {'W', 'i', 'l', 'e', 'y'};
		String company = "Wiley";
		System.out.println("Company: " + company);
		System.out.print("Characters: [");
		for(char character : characters) {
			System.out.print(character);
		}
		System.out.println("]");
		System.out.println();
		char[] name = {68, 73, 76, 73, 80};
		System.out.println(name);
	}
}