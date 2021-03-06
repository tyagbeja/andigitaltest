package com.andigital.foursquare.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {
	private String name;
	private Location location;
	
	public Venue(){
		
	}
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	
	public final Location getLocation() {
		return location;
	}
	public final void setLocation(Location location) {
		this.location = location;
	}
}
