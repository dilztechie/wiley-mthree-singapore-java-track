public class AllShapes {
	public static void main(String[] args) {
		Shape shape;
		
		Square square = new Square(21);
		Rectangle rectangle = new Rectangle(12, 15);
		
		shape = square;
		System.out.println("Area of the Square = " + shape.area());
		
		shape = rectangle;
		System.out.println("Area of the Rectangle = " + shape.area());
	}
}