public class Square extends Shape {
	public Square(double side) {
		super(side, side);
	}
	
	@Override
	public double area() {
		return getLength() * getBreadth();
	}
}