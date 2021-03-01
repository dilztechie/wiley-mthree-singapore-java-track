public class ArrayListDemo {
	public static void main(String[] args) {
		java.util.List<String> list = new java.util.ArrayList<>();
		System.out.println("Initial size of the list = " + list.size());
		list.add("Dilip");
		list.add("Kiran");
		list.add("Kavya");
		list.add("Gopal");
		list.add("Santhosh");
		list.add("Mahesh");
		list.add("Shruthi");
		System.out.println("list = " + list);
		System.out.println("Size of the list = " + list.size());
		list.remove("Gopal");
		list.remove("Shruthi");
		System.out.println("Updated list = " + list);
		System.out.println("After removing, size of the list = " + list.size());
	}
}