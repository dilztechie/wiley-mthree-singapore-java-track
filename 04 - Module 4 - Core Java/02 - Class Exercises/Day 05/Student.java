public class Student {
	private long id;
	private String name;
	private Address address;
	private long contact;

	public Student(long id, String name, Address address, long contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public long getContact() {
		return contact;
	}
}