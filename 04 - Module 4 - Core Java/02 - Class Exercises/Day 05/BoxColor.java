public class BoxColor extends Box {
	private String color;
	
	public BoxColor() {
		super();
	}
	
	public BoxColor(double height, double width, double depth, String color) {
		super(height, width, depth);
		this.color = color;
	}

	public BoxColor(double value, String color) {
		super(value);
		this.color = color;
	}
	
	public BoxColor(BoxColor object) {
		super(object);
		this.color = object.color;
	}
	
	@Override
	public String toString() {
		return "BoxColor [" + super.toString() + ", color= " + color + "]";
	}
}