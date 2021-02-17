public abstract class Shape {
	private double length;
	private double breadth;
	
	public Shape(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}

	public abstract double area();
}