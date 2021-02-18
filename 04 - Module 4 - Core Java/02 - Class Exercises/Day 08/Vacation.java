public class Vacation {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws DestinationNotFoundException {
		String[] destinations = {
			"Singapore", "Dubai", "Paris", "Switzerland", "Goa"	
		};
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter your Vacation Destination: ");
		String userDestination = in.nextLine();
		boolean found = false;
		for(String destination : destinations) {
			if(destination.equalsIgnoreCase(userDestination)) {
				found = true;
				break;
			}
		}
		if(!found) {
			throw new DestinationNotFoundException("Destination not Found!");
		}
		System.out.println("Have a Wonderful Vacation to " + userDestination);
		in.close();
	}
}