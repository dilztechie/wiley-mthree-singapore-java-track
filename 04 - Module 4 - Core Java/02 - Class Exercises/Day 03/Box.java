public class Box {
	private double height;
	private double width;
	private double depth;
	
	Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	Box() {} // Explicitly putting the Default Constructor
	
	Box(double value) {
		height = width = depth = value;
	}
	
	Box(Box object) {
		height = object.height;
		width = object.width;
		depth = object.depth;
	}
	
	/*
	 * void setHeight(double height) { this.height = height; }
	 */
	double getHeight() {
		return height;
	}
	
	/*
	 * void setWidth(double width) { this.width = width; }
	 */
	double getWidth() {
		return width;
	}
	
	/*
	 * void setDepth(double depth) { this.depth = depth; }
	 */
	double getDepth() {
		return depth;
	}
	
	Box doubleBox() {
		return new Box(height * 2, width * 2, depth * 2);
	}
	
	double volume() {
		return height * width * depth;
	}
}