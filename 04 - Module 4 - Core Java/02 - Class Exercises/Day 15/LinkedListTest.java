public class LinkedListTest {
	public static void main(String[] args) {
		java.util.List<String> list1 = new java.util.ArrayList<>();
		java.util.List<String> list2 = new java.util.ArrayList<>();
		java.util.List<String> list3 = new java.util.ArrayList<>();
		
		// fill list1
		java.util.Collections.addAll(list1, new String[] {"Dilip", "Kavya", "Shruthi", "Kiran"});
		
		// fill list2
		java.util.Collections.addAll(list2, new String[] {"Mahesh", "Rashmi", "Santhosh", "Vidya"});
		
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		
		java.util.ListIterator<String> iterator = list2.listIterator(list2.size());
		while(iterator.hasPrevious()) {
			list3.add(iterator.previous());
		}
		System.out.println("list3: " + list3);
		
		java.util.LinkedList<String> allList = new java.util.LinkedList<>();
		allList.addFirst("Start of List 1");
		allList.addAll(list1);
		allList.add("End of List 1");
		allList.add("Start of List 2");
		allList.addAll(list2);
		allList.addLast("End of List 2");
		
		System.out.println("allList: " + allList);
		
		allList.removeFirst();
		allList.removeLast();
		System.out.println("allList after removing First & Last: " + allList);
		
		allList.remove(4);
		allList.remove(4);
		System.out.println("allList after removing element: " + allList);
		
		java.util.Collections.sort(allList);
		System.out.println("allList sorted in ascending order: " + allList);
		java.util.Collections.sort(allList, java.util.Collections.reverseOrder());
		System.out.println("allList sorted in descending order: " + allList);
	}
}