public class IntermediatePhone extends BasicPhone {
	private String	os;
	private boolean	gps;
	private boolean	bluetooth;
	private boolean radio;
	private boolean usb;
	private String 	sensors;
	private String	browser;
	
	public IntermediatePhone(String company, String model, String technology, 
							String dimensions, double weight, String sim, 
							String displayType, double screenSize, 
							String resolution, String os, boolean cardSlot, 
							boolean phoneBook, int internalMemory, 
							boolean camera, double cameraPixels, 
							boolean gps, boolean bluetooth, boolean radio,
							boolean usb, String sensors, String browser,
							int batteryCapacity, double price) {
		
		super(company, model, technology, dimensions, weight, sim, 
				displayType, screenSize, resolution, cardSlot, phoneBook,
				internalMemory, camera, cameraPixels, batteryCapacity, price);
		
		this.os 		= os;
		this.gps 		= gps;
		this.bluetooth 	= bluetooth;
		this.radio 		= radio;
		this.usb 		= usb;
		this.sensors 	= sensors;
		this.browser 	= browser;
	}
	
	public String toString() {
		return
				super.toString()									+ "\n" +
				"PLATFORM"											+ "\n" +
				"OS : " 		+ os								+ "\n" +
				"COMMS"												+ "\n" +
				"GPS : " 		+ (gps ? "Yes" : "No")				+ "\n" +
				"Bluetooth : " 	+ (bluetooth ? "Yes" : "No") 		+ "\n" +
				"Radio : " 		+ (radio ? "Yes" : "No")			+ "\n" +
				"USB : " 		+ (usb ? "Yes" : "No")				+ "\n" +
				"FEATURES"											+ "\n" +
				"Sensors : " 	+ sensors							+ "\n" +
				"Browser : " 	+ browser;
	}
}
