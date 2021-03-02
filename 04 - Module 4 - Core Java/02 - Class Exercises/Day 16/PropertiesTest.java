public class PropertiesTest {
	public static void main(String[] args) throws java.io.IOException {
		/*
		 * java.util.Properties -> stores data as "key", "value" pairs
		 * use methods "setProperty" and "getProperty" to manipulate
		 */
		java.util.Properties table = new java.util.Properties();
		table.setProperty("id", "12");
		table.setProperty("name", "Dilip");
		table.setProperty("gender", "M");
		table.setProperty("height", "5.10");
		table.setProperty("salary", "25431.86");
		
		System.out.println("Saving Properties in File...");
		java.io.FileOutputStream stream = new java.io.FileOutputStream("props.dat");
		table.store(stream, "Sample Property File");
		stream.close();
		
		System.out.println("After setting Properties:");
		java.util.Set<Object> keys = table.keySet();
		for(Object key : keys) {
			System.out.println(key + ": " + table.getProperty((String) key));
		}
		System.out.println();
		
		table.setProperty("salary", "50000");
		
		System.out.println("After Updating Properties:");
		keys = table.keySet();
		for(Object key : keys) {
			System.out.println(key + ": " + table.getProperty((String) key));
		}
		System.out.println();
		
		table.clear();
		
		System.out.println("After Clearing Properties:");
		keys = table.keySet();
		for(Object key : keys) {
			System.out.println(key + ": " + table.getProperty((String) key));
		}
		System.out.println();
	}
}