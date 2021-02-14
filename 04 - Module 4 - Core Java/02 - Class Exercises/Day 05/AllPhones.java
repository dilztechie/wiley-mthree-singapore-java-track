public class AllPhones {
	public static void main(String[] args) {
		BasicPhone nokia208 = new BasicPhone(
					"Nokia", "208", "GSM / HSPA", "114.2 x 50.9 x 12.8 mm",
					89.6, "Single SIM (Micro-SIM)", "TFT 256K colors", 2.4,
					"240 x 320 pixels", true, true, 256, true, 1.3, 1020, 4422.0);
		
		IntermediatePhone nokiaAsha500 = new IntermediatePhone(
					"Nokia", "Asha 500", "GSM", "100.3 x 58.1 x 12.8 mm",
					101, "Micro SIM", "TFT Capacitive TouchScreen", 
					2.8, "240 x 320 pixels", "Nokia Asha Software Platform 1.1.1", 
					true, true, 64, true, 2, false, true, true, true, 
					"Accelometer, proximity", "WAP 2.0 / xHTML, HTML",
					1200, 8844.0);
		
		SmartPhone appleIPhone7Plus = new SmartPhone(
				"Apple", "iPhone 7 Plus", "GSM / CDSM / HSPA / EVDO / LTE", 
				"158.2 x 77.9 x 7.3 mm", 188, "Nano-SIM",
				"LED-backlit IPS LCD, Capacitive TouchScreen", 
				5.5, "1080 x 1920 pixels", "iOS 10.0.1", "Apple A10 Fusion", 
				"Quad-core 2.34 Ghz", "PowerVR Series 7XT Plus", 
				false, true, 256, true, 12, "2160p@30fps", true, true, true,
				false, true, "Fingerprint, Accelometer, proximity", 
				"HTML5 (Safari)", 2900, 66249.0);
		
		System.out.println(nokia208);
		System.out.println();
		System.out.println(nokiaAsha500);
		System.out.println();
		System.out.println(appleIPhone7Plus);
	}
}
