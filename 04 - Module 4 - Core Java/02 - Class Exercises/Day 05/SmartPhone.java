public class SmartPhone extends IntermediatePhone {
	private String 	chipset;
	private String	cpu;
	private String 	gpu;
	private String 	video;
	private boolean	nfc;
	
	public SmartPhone(String company, String model, String technology, 
						String dimensions, double weight, String sim, 
						String displayType, double screenSize, 
						String resolution, String os, String chipset, 
						String cpu, String gpu, boolean cardSlot, 
						boolean phoneBook, int internalMemory, 
						boolean camera, double cameraPixels, 
						String video, boolean gps, boolean bluetooth, 
						boolean nfc, boolean radio, boolean usb, 
						String sensors, String browser, int batteryCapacity, 
						double price) {
		
		super(company, model, technology, dimensions, weight, sim, 
				displayType, screenSize, resolution, os, cardSlot, phoneBook, 
				internalMemory, camera, cameraPixels, gps, bluetooth, radio,
				usb, sensors, browser, batteryCapacity, price);
		
		this.chipset	= chipset;
		this.cpu		= cpu;
		this.gpu		= gpu;
		this.video		= video;
		this.nfc 		= nfc;
	}
	
	public String toString() {
		return
				super.toString()				+ "\n" +
				"PLATFORM"						+ "\n" +
				"Chipset : " 		+ chipset	+ "\n" +
				"CPU : "			+ cpu		+ "\n" +
				"GPU : " 			+ gpu 		+ "\n" +
				"CAMERA"						+ "\n" +
				"Video : "			+ video		+ "\n" +
				"COMMS"							+ "\n" +
				"NFC : " + (nfc ? "Yes" : "No");
	}
}
