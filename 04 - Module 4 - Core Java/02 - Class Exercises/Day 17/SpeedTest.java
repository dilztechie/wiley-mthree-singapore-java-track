public class SpeedTest {
	public static void main(String[] args) {
		Speed vehicle = (vehicleSpeed) -> "Running at speed: " + vehicleSpeed;
		
		int speed = 120;
		System.out.println(vehicle.run(speed));
		double anotherSpeed = 80.5;
		System.out.println(vehicle.run(anotherSpeed));
	}
}