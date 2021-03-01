public class CollectionTest {
	private static final String[] colors = {"BLACK", "RED", "GREEN", "BLUE", "WHITE"};
	private static final String[] removeColors = {"BLACK", "WHITE"};
	
	public static void main(String[] args) {
		// create a list from colors list
		java.util.List<String> list = new java.util.ArrayList<>();
		java.util.List<String> removeList = new java.util.ArrayList<>();
		
		// add elements in list from colors
		java.util.Collections.addAll(list, colors);
		// add elements in removeList from removeColors
		java.util.Collections.addAll(removeList, removeColors);
		
		// display the colors list
		System.out.println("colors: " + list);
		
		// obtain an iterator to iterate thru colors
		java.util.Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(removeList.contains(iterator.next())) {
				iterator.remove();
			}
		}
		
		// display the colors after removing
		System.out.println("colors: " + list);
	}
}