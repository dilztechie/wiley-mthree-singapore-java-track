public class BoxWeight extends Box {
	private double weight;
	
	public BoxWeight() {
		super();
	}
	
	public BoxWeight(double height, double width, double depth, double weight) {
		super(height, width, depth);
		this.weight = weight;
	}
	
	public BoxWeight(double value) {
		super(value);
		weight = value;
	}
	
	public BoxWeight(BoxWeight object) {
		super(object);
		weight = object.weight;
	}

	@Override
	public String toString() {
		return "BoxWeight [" + super.toString() + ", weight= " + weight + "]";
	}
}