public class BasicPhone {
	private String 	company;
	private String	model;
	private String 	technology;
	private String 	dimensions;
	private double 	weight;
	private String 	sim;
	private String 	displayType;
	private double 	screenSize;
	private String 	resolution;
	private boolean cardSlot;
	private boolean phoneBook;
	private int 	internalMemory;
	private boolean camera;
	private double 	cameraPixels;
	private int 	batteryCapacity;
	private double	price;
	
	public BasicPhone(String company, String model, String technology, 
						String dimensions, double weight, String sim, 
						String displayType, double screenSize, 
						String resolution, boolean cardSlot, 
						boolean phoneBook, int internalMemory, 
						boolean camera, double cameraPixels, 
						int batteryCapacity, double price) {
		this.company 			= company;
		this.model				= model;
		this.technology 		= technology;
		this.dimensions 		= dimensions;
		this.weight 			= weight;
		this.sim 				= sim;
		this.displayType 		= displayType;
		this.screenSize 		= screenSize;
		this.resolution 		= resolution;
		this.cardSlot 			= cardSlot;
		this.phoneBook 			= phoneBook;
		this.internalMemory 	= internalMemory;
		this.camera 			= camera;
		this.cameraPixels 		= cameraPixels;
		this.batteryCapacity 	= batteryCapacity;
		this.price				= price;
	}

	public String toString() {
		return	
				"Specifications of " 	+ company + " " + model		+ "\n" +
				"NETWORK"											+ "\n" +
				"Technology : " 		+ technology				+ "\n" +
				"BODY"												+ "\n" +
				"Dimensions : " 		+ dimensions				+ "\n" +
				"Weight : " 			+ weight					+ "\n" +
				"SIM : " 				+ sim						+ "\n" +
				"DISPLAY"											+ "\n" +
				"Type : " 				+ displayType				+ "\n" +
				"Size : " 				+ screenSize				+ "\n" +
				"Resolution : " 		+ resolution				+ "\n" +
				"MEMORY"											+ "\n" +
				"Card Slot : " 			+ (cardSlot ? "Yes" : "No") + "\n" +
				"Phone Book : " 		+ (phoneBook ? "Yes" : "No")+ "\n" +
				"Internal : " 			+ internalMemory			+ "\n" +
				"CAMERA : " 			+ (camera ? "Yes" : "No")	+ "\n" +
				"Camera Pixels : " 		+ cameraPixels				+ "\n" +
				"BATTERY : " 			+ batteryCapacity + "mAH"	+ "\n" +
				"PRICED AT : INR " 		+ price;
	}
}
