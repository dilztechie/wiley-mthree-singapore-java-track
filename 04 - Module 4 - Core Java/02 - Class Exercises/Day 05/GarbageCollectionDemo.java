public class GarbageCollectionDemo {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box(12.0, 26.0, 15.0);
		Box box3 = box2;
		Box box4, box5;
		box4 = box5 = new Box(10, 20, 30);
		
		System.out.println("Initially");
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println();

		box3.setDepth(100.0);
		System.out.println("After Update");
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println();
		
		box2 = null;
		System.out.println("After box3 Garbage Collected");
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println();
		
		System.out.println(box4);
		System.out.println(box5);
		System.out.println();
		box4.setHeight(1000);
		System.out.println(box4);
		System.out.println(box5);
	}
}