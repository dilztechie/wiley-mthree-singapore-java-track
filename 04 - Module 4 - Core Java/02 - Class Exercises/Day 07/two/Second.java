package two;

public class Second {
	boolean isFiled;
	double returns;
	
	public Second(boolean isFiled, double returns) {
		this.isFiled = isFiled;
		this.returns = returns;
	}
	
	@Override
	public String toString() {
		return "Second [isFiled=" + isFiled + ", returns=" + returns + "]";
	}
}