public class VectorTest {
	public static void main(String[] args) {
		String[] names = {
			"Dilip", "Kavya", "Kiran", "Santhosh", "Vidya", "Mahesh", "Rashmi", "Sundeep", "Reshma", "Rensan"	
		};
		java.util.List<String> list = new java.util.ArrayList<>();
		java.util.Vector<String> vector = new java.util.Vector<>(15);
		System.out.println("Initial Size of the List: " + list.size());
		System.out.println("Initial Size of the Vector: " + vector.size());
		System.out.println("Initial Capacity of the Vector: " + vector.capacity());
		for(String name : names) {
			list.add(name);
			vector.add(name);
		}
		System.out.println("Size of the List: " + list.size());
		System.out.println("Size of the Vector: " + vector.size());
		System.out.println("Capacity of the Vector: " + vector.capacity());
		try {
			System.out.println("First Element: " + vector.firstElement());
			System.out.println("Last Element: " + vector.lastElement());
			System.out.println("Mid Element: " + vector.elementAt(vector.capacity()/2));
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("No Such Element");
		}
		vector.add("Shruthi");
		System.out.println("After adding a name, Capacity of the Vector: " + vector.capacity());
		System.out.println("List: " + list);
		System.out.println("Vector: " + vector);
	}
}