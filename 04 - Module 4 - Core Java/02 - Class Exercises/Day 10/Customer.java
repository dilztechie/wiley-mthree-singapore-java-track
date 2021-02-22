public class Customer {
	private long id;
	private String name;
	private Date birthDate; // Composition / Aggregation
	
	public Customer(long id, String name, Date birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
}