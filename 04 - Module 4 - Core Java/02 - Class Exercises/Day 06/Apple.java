public enum Apple {
	
	Jonathan(10), Golden(9), Wine(20), Cortland(15), Green(5);
	
	private int price;
	
	Apple(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}