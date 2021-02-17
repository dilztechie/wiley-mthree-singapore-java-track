public class GarbageCollectionDemo {
	
	private int number;
	private String name;
	
	public GarbageCollectionDemo(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public static void main(String[] args) {
		GarbageCollectionDemo object1 = new GarbageCollectionDemo(12, "Dilip");
		System.out.println("object1: " + object1);
		GarbageCollectionDemo object2 = object1;
		System.out.println("object2: " + object2);
		System.out.println();
		object1 = null;
		System.gc(); // Explicitly do the Garbage Collection & Call the Finalize Method
		System.out.println("object1: " + object1);
		System.out.println("object2: " + object2);
	}
	
	@Override
	public String toString() {
		return "GarbageCollectionDemo [number=" + number + ", name=" + name + "]";
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage Collected");
	}
}