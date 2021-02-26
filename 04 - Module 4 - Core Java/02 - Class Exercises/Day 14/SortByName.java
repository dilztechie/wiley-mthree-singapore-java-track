public class SortByName implements java.util.Comparator<Employee> {
	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.getName().compareTo(arg1.getName()) > 1) {
			return 1;
		} else if(arg0.getName().compareTo(arg1.getName()) < 1) {
			return -1;
		} else {
			return 0;
		}
	}
}