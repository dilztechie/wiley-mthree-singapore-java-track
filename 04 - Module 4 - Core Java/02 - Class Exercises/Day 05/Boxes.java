public class Boxes {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box(12.0, 15.0, 26.0);
		Box box3 = new Box(8.0);
		Box box4 = new Box(box2);
		BoxWeight boxWeight1 = new BoxWeight();
		BoxWeight boxWeight2 = new BoxWeight(8.0, 14.0, 30.0, 100.0);
		BoxWeight boxWeight3 = new BoxWeight(26.0);
		BoxWeight boxWeight4 = new BoxWeight(boxWeight2);
		BoxColor boxColor1 = new BoxColor();
		BoxColor boxColor2 = new BoxColor(8.0, 14.0, 30.0, "Blue");
		BoxColor boxColor3 = new BoxColor(26.0, "Green");
		BoxColor boxColor4 = new BoxColor(boxColor2);
		
		System.out.println("Properties of Box 1:");
		System.out.println(box1);
		System.out.println();
		
		System.out.println("Properties of Box 2:");
		System.out.println(box2);
		System.out.println();
		
		System.out.println("Properties of Box 3:");
		System.out.println(box3);
		System.out.println();
		
		System.out.println("Properties of Box 4:");
		System.out.println(box4);
		System.out.println();
		
		System.out.println("Properties of BoxWeight 1:");
		System.out.println(boxWeight1);
		System.out.println();
		
		System.out.println("Properties of BoxWeight 2:");
		System.out.println(boxWeight2);
		System.out.println();
		
		System.out.println("Properties of BoxWeight 3:");
		System.out.println(boxWeight3);
		System.out.println();
		
		System.out.println("Properties of BoxWeight 4:");
		System.out.println(boxWeight4);
		System.out.println();
		
		System.out.println("Properties of BoxColor 1:");
		System.out.println(boxColor1);
		System.out.println();
		
		System.out.println("Properties of BoxColor 2:");
		System.out.println(boxColor2);
		System.out.println();
		
		System.out.println("Properties of BoxColor 3:");
		System.out.println(boxColor3);
		System.out.println();
		
		System.out.println("Properties of BoxColor 4:");
		System.out.println(boxColor4);
		System.out.println();
	}
}