package com.andigital.foursquare.model;

public class Item {
	Venue venue;
	public Item() {

	}
	@Override
    public String toString() {
        return "Item{" +
                "venue='" + venue.toString() + '\'' +
                '}';
    }
	public final Venue getVenue() {
		return venue;
	}
	public final void setVenue(Venue venue) {
		this.venue = venue;
	}
}
