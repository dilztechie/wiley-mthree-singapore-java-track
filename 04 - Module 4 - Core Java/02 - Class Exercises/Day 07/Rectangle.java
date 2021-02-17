public class Rectangle extends Shape {
	public Rectangle(double length, double breadth) {
		super(length, breadth);
	}
	
	@Override
	public double area() {
		return .5 * getLength() * getBreadth();
	}
}