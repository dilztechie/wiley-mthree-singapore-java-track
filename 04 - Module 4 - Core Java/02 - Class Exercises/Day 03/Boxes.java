public class Boxes {
	public static void main(String[] args) {
		Box box1 = new Box(); // Default Constructor
		
		// box1.setHeight(30.0);
		// box1.setWidth(40.0);
		// box1.setDepth(80.0);
		
		Box box2 = new Box(12.0, 15.0, 26.0);
		Box box3 = new Box(21.0);
		
		Box box4 = box1; // Reference to box1
		// box4.setWidth(35.0);
		
		Box box5 = new Box(box2);
		// box5.setWidth(40.0);
		
		Box box6 = box1.doubleBox();

		System.out.println("Properties of Box 1:");
		System.out.println("Height = " + box1.getHeight());
		System.out.println("Width = " + box1.getWidth());
		System.out.println("Depth = " + box1.getDepth());
		System.out.println("Volume = " + box1.volume());
		System.out.println();

		System.out.println("Properties of Box 2:");
		System.out.println("Height = " + box2.getHeight());
		System.out.println("Width = " + box2.getWidth());
		System.out.println("Depth = " + box2.getDepth());
		System.out.println("Volume = " + box2.volume());
		System.out.println();

		System.out.println("Properties of Box 3:");
		System.out.println("Height = " + box3.getHeight());
		System.out.println("Width = " + box3.getWidth());
		System.out.println("Depth = " + box3.getDepth());
		System.out.println("Volume = " + box3.volume());
		System.out.println();

		System.out.println("Properties of Box 4:");
		System.out.println("Height = " + box4.getHeight());
		System.out.println("Width = " + box4.getWidth());
		System.out.println("Depth = " + box4.getDepth());
		System.out.println("Volume = " + box4.volume());
		System.out.println();

		System.out.println("Properties of Box 5:");
		System.out.println("Height = " + box5.getHeight());
		System.out.println("Width = " + box5.getWidth());
		System.out.println("Depth = " + box5.getDepth());
		System.out.println("Volume = " + box5.volume());
		System.out.println();

		System.out.println("Properties of Box 6:");
		System.out.println("Height = " + box6.getHeight());
		System.out.println("Width = " + box6.getWidth());
		System.out.println("Depth = " + box6.getDepth());
		System.out.println("Volume = " + box6.volume());
		System.out.println();
	}
}