public class HashSetDemo {
	public static void main(String[] args) {
		/* 
		 * Hashing is a mechanism used to determine a unique value - "hash code"
		 * the data entered in HashSet will be entered based on this hash code
		 * no duplication allowed
		 */
		java.util.Set<String> names = new java.util.HashSet<>();
		names.add("Dilip");
		names.add("Kiran");
		names.add("Mahesh");
		names.add("Santhosh");
		names.add("Dilip");
		names.add("Kavya");
		names.add("Vidya");
		names.add("Rashmi");
		names.add("Melita");
		names.add("Kiran");
		names.add("Kavya");
		System.out.println("Names: " + names);
		
		for(String name : names) {
			System.out.println(name + " has hashcode " + name.hashCode());
		}
		
	}
}