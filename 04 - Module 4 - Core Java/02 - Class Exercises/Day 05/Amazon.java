public class Amazon {
	public static void main(String[] args) {
		Product[] products = {
			new Product(1, "Chandeliers", 
					"Blissbee BB Modern Glass Crystal Chandelier Fixture Pendant 3 LED Ceiling Light Lamp, "
					+ "L8.5 X W20-inch, Yellow and White Light", 3650.00),
			new Product(2, "Inverters", 
					"Luminous Inverter & Battery Combo with Trolley for Home, "
					+ "Office & Shops (Zelio+ 1100 Pure Sine Wave Inverter, "
					+ "RC 15000 120 Ah Tall Tubular Battery)", 15499.00),
			new Product(3, "Refrigerators", 
					"LG 190 L 5 Star Inverter Direct-Cool Single Door Refrigerator "
					+ "(GL-D201APZZ, Shiny Steel, Base stand with drawer)", 16490.00)
		};
		for(Product product : products) {
			System.out.println(product.getId() + ": " + product.getName());
			System.out.println("Description: " + product.getDescription());
			System.out.println("Price: " + product.getPrice());
			System.out.println();
		}
	}
}