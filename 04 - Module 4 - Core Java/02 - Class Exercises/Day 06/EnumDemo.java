public class EnumDemo {
	public static void main(String[] args) {
		Apple appleGreen = Apple.Green;
		Apple appleRed = Apple.Wine;
		
		System.out.println("Value of appleGreen: " + appleGreen);
		System.out.println("Value of appleRed: " + appleRed);
		
		Apple apple = Apple.Wine;
		switch(apple) {
			case Cortland: System.out.println("Cortland Apples are Best"); break;
			case Jonathan: System.out.println("Jonathan Apples are Good"); break;
			case Wine: System.out.println("Wine Red Apples are Tasty");
		}
		
		System.out.println("Wine Red Apples costs: " + apple.getPrice());
		
		for(Apple eachApple : Apple.values()) {
			System.out.println(eachApple);
		}
	}
}