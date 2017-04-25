package com.andigital.foursquare.model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testGetAndSetVenue() {
		Item item = new Item();
		Venue venue = new Venue();
		venue.setName("Test");
		item.setVenue(venue);
		assertThat(item.getVenue(), equalTo(venue));
		assertThat(item.getVenue().getName(), is("Test"));
	}

}
