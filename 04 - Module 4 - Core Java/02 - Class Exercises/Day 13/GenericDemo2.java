public class GenericDemo2 {
	public static void main(String[] args) {
		MyTemplate2<Integer, String> object1 = new MyTemplate2<Integer, String>(15, "Kiran");
		MyTemplate2<String, String> object2 = new MyTemplate2<String, String>("Maharashtra", "India");
		MyTemplate2<String, org.wiley.ems.bean.Employee> object3 =
				new MyTemplate2<String, org.wiley.ems.bean.Employee>("Trainer", 
						new org.wiley.ems.bean.Employee(12, "Dilip", 50000));
		MyTemplate2<String, org.wiley.ems.bean.Employee> object4 =
				new MyTemplate2<String, org.wiley.ems.bean.Employee>("HR", 
						new org.wiley.ems.bean.Employee(26, "Kavya", 15000));
		
		System.out.println("Object 1: [id=" + object1.getObject() + 
				", name=" + object1.getValue() + "]");
		System.out.println("Object 2: [state=" + object2.getObject() + 
				", country=" + object2.getValue() + "]");
		System.out.println("Object 3: [department=" + object3.getObject() + 
				", employee=" + object3.getValue() + "]");
		System.out.println("Object 4: [department=" + object4.getObject() + 
				", employee=" + object4.getValue() + "]");
	}
}