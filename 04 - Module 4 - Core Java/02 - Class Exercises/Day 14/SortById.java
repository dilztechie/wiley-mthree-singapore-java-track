public class SortById implements java.util.Comparator<Employee> {
	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.getId() > arg1.getId()) {
			return 1;
		} else if(arg0.getId() < arg1.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}