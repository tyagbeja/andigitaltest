package com.andigital.foursquare.model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void testGetAndSetAddress() {
		Location location = new Location();
		location.setAddress("Test Address");
		assertThat(location.getAddress(), is("Test Address"));
	}
	@Test
	public void testGetAndSetCity() {
		Location location = new Location();
		location.setCity("Test City");
		assertThat(location.getCity(), is("Test City"));
	}
	@Test
	public void testGetAndSetState() {
		Location location = new Location();
		location.setState("Test State");
		assertThat(location.getState(), is("Test State"));
	}
	@Test
	public void testGetAndSetPostalCode() {
		Location location = new Location();
		location.setPostalCode("Test Postcode");
		assertThat(location.getPostalCode(), is("Test Postcode"));
	}

}
