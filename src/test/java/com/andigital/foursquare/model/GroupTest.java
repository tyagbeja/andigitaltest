package com.andigital.foursquare.model;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GroupTest {
	
	

	@Test
	public void testGetAndSetItems() {
		Group group = new Group();
		List<Item> items = new ArrayList<Item>();
		items.add(new Item());
		group.setItems(items);
		assertThat(group.getItems(), equalTo(items));
		assertThat(group.getItems().size(), is(1));
	}
}
