package org.wiley.sms.bean;

public class Address {
	private String place;
	private String city;
	private String state;
	private String country;
	
	public Address(String place, String city, String state, String country) {
		this.place = place;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [place=" + place + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}