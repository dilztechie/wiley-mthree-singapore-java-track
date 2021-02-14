public class Department {
	private long id;
	private String name;
	private Address[] address;
	
	public Department(long id, String name, Address[] address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address[] getAddress() {
		return address;
	}
}