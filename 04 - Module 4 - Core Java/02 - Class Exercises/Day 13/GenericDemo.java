public class GenericDemo {
	public static void main(String[] args) {
		MyTemplate<Integer> object1 = new MyTemplate<Integer>(12);
		MyTemplate<String> object2 = new MyTemplate<String>("Dilip");
		MyTemplate<org.wiley.ems.bean.Employee> object3 = new MyTemplate<org.wiley.ems.bean.Employee>(
				new org.wiley.ems.bean.Employee(26, "Kiran", 50000));
		
		System.out.println("Object 1: " + object1.getObject());
		System.out.println("Object 2: " + object2.getObject());
		System.out.println("Object 3: " + object3.getObject());
	}
}