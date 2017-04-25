package com.andigital.foursquare.model;

public class Location {
	String address;
	String state;
	String city;
	String postalCode;
	
	public final String getAddress() {
		return address;
	}

	public final String getState() {
		return state;
	}

	public final String getCity() {
		return city;
	}

	public final String getPostalCode() {
		return postalCode;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	public final void setState(String state) {
		this.state = state;
	}

	public final void setCity(String city) {
		this.city = city;
	}

	public final void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
