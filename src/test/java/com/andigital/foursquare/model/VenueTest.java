package com.andigital.foursquare.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class VenueTest {

	@Test
	public void testGetAndSetName() {
		Venue venue = new Venue();
		venue.setName("Test");
		assertThat(venue.getName(), is("Test"));
	}
	
	@Test
	public void testGetAndSetLocation() {
		Venue venue = new Venue();
		Location location = new Location();
		venue.setLocation(location);
		assertThat(venue.getLocation(), equalTo(location));
	}

}
