public class MapDemo {
	public static void main(String[] args) {
		java.util.Map<String, Double> employees = new java.util.TreeMap<>();
		employees.put("Dilip", 50000.0);
		employees.put("Kiran", 75000.0);
		employees.put("Kavya", 30000.0);
		employees.put("Santhosh", 15000.0);
		employees.put("Vidya", 25000.0);
		employees.put("Rashmi", 20000.0);
		employees.put("Mahesh", 18000.0);
		
		java.util.Set<java.util.Map.Entry<String, Double>> set = employees.entrySet();
		for(java.util.Map.Entry<String, Double> employee : set) {
			System.out.println(employee.getKey() + ": " + employee.getValue());
		}
		System.out.println();
		
		double salary = employees.get("Santhosh");
		salary += salary * .18;
		employees.put("Santhosh", salary);
		System.out.println("Updated salary for Santhosh");
		set = employees.entrySet();
		for(java.util.Map.Entry<String, Double> employee : set) {
			System.out.println(employee.getKey() + ": " + employee.getValue());
		}
		System.out.println();
	}
}