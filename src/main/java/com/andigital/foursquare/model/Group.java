package com.andigital.foursquare.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {
	List<Item> items;

	public Group() {

	}

	public final List<Item> getItems() {
		return items;
	}

	public final void setItems(List<Item> items) {
		this.items = items;
	}
}
