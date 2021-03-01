public class List2Array {
	public static void main(String[] args) {
		java.util.List<Integer> list = new java.util.ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(26);
		list.add(21);
		list.add(14);
		System.out.println("list = " + list);
		Integer[] array = new Integer[list.size()];
		// toArray method of ArrayList converts the ArrayList to an Object[] Array
		list.toArray(array);
		int sum = 0;
		for(int value : array) {
			sum+= value;
		}
		System.out.println("array = " + java.util.Arrays.toString(array) + ", sum = " + sum);
	}
}