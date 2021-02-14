public class Box {
	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	private double height, width, depth;

	public Box() {}

	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public Box(double value) {
		height = width = depth = value;
	}
	
	public Box(Box object) {
		height = object.height;
		width = object.width;
		depth = object.depth;
	}
	
	public double volume() {
		return height * width * depth;
	}
	
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + ", volume=" + volume() + "]";
	}
}