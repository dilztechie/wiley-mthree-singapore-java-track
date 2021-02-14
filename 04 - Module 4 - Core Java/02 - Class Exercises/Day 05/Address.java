public class Address {
	private long id;
	private String place;
	private String city;
	private String country;
	
	public Address(long id, String place, String city, String country) {
		this.id = id;
		this.place = place;
		this.city = city;
		this.country = country;
	}

	public long getId() {
		return id;
	}
	public String getPlace() {
		return place;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
}